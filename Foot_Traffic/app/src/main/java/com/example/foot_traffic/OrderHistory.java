package com.example.foot_traffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.room.Index;
import androidx.room.Room;

import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.foot_traffic.entities.History;
import com.example.foot_traffic.model.CategoryItem;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory extends AppCompatActivity {

    ListView listview;
    ArrayAdapter<String> historylistadapter;
    ArrayList<String> historyarray;
    ArrayList<String> historyid;
    DatabaseReference history;
    DrawerLayout drawerlayout;

    public static MyOrderHistoryDB orderhistorydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        listview = findViewById(R.id.lv_orderhistory);
        drawerlayout = findViewById(R.id.drawer_layout);

        historylistadapter = new ArrayAdapter<>(OrderHistory.this, android.R.layout.simple_list_item_1);
        historyarray = new ArrayList<String>();
        historyid = new ArrayList<String>();

        orderhistorydb = Room.databaseBuilder(OrderHistory.this, MyOrderHistoryDB.class,"OrderHistoryDB").build();

        getAllOrder();

    }

    public void getAllOrder(){

        new Thread(new Runnable() {
            @Override
            public void run() {

                List<History> orderhistory = orderhistorydb.historydao().getAllHistory();
                String orderinfo;
                for(History history:orderhistory){

                    orderinfo = "ID: " + history.getOrderID() +"\nShoe Name: "
                            +history.getOrder()+"\nPrice: " + history.getPrice()
                            +"\nSize: "+history.getSize();

                    historyarray.add(orderinfo);
                    historyid.add(history.getOrderID());

                }

                showDataInListView();

            }
        }).start();

    }

    public void showDataInListView(){

        OrderHistory.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                historylistadapter.clear();

                historylistadapter.addAll(historyarray);
                listview.setAdapter(historylistadapter);
            }
        });

    }

    public void toast(final Context context, final String text){

        Handler handler = new Handler (Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void ClickMenu(View view){
        HomePageActivity.openDrawer(drawerlayout);
    }

    public void ClickProfile(View view){
        HomePageActivity.closeDrawer(drawerlayout);
    }

    public void ClickHome(View view){
        HomePageActivity.redirectActivity(this,HomePageActivity.class);
    }

    public void ClickAboutUs(View view){
        HomePageActivity.redirectActivity(this,AboutUs.class);
    }

    public void ClickHelp(View view){
        HomePageActivity.redirectActivity(this,Help.class);
    }

    public void ClickLocationSensor(View view){
        HomePageActivity.redirectActivity(this,LocationSensor.class);
    }

    public void ClickMyAccount(View view){
        HomePageActivity.redirectActivity(this,MyAccount.class);
    }

    public void ClickSetting(View view){
        HomePageActivity.redirectActivity(this,Setting.class);
    }

    public void ClickOrderHistory(View view){
        recreate();
    }

    public void ClickLogOut(View view){
        HomePageActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        HomePageActivity.closeDrawer(drawerlayout);
    }
}
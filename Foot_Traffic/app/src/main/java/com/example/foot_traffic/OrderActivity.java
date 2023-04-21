package com.example.foot_traffic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foot_traffic.entities.History;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderActivity extends AppCompatActivity {

    TextView name,price,size;
    String test1,test2;
    Button cancel,order;
    AlertDialog alertDialog;
    TextView randomOrder;
    ArrayAdapter<String> historylistadapter;
    ArrayList<String> historyarray;
    ArrayList<String> historyid;
    DatabaseReference history;
    public static MyOrderHistoryDB orderhistorydb;

    int randomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        name = findViewById(R.id.ordername);
        price = findViewById(R.id.PriceOrder);
        size = findViewById(R.id.sizeorder);
        cancel = findViewById(R.id.cancelbuttonOrder);
        order = findViewById(R.id.buttonOrder);
        randomOrder = findViewById(R.id.ordernum);

        test1 = getIntent().getStringExtra("Name");
        test2 = getIntent().getStringExtra("Price");
        size.setText(getIntent().getStringExtra("Size"));

        name.setText(test1);
        price.setText("RM "+test2);

        historylistadapter = new ArrayAdapter<>(OrderActivity.this, android.R.layout.simple_list_item_1);
        historyarray = new ArrayList<String>();
        historyid = new ArrayList<String>();

        orderhistorydb = Room.databaseBuilder(OrderActivity.this, MyOrderHistoryDB.class,"OrderHistoryDB").build();

        Random random = new Random();
        randomNum = random.nextInt(1234567891 + 12345) +123;

        randomOrder.setText(String.valueOf(randomNum));

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomePageActivity.class);
                startActivity(intent);
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saveorderhistory();
                showOrderSuccessDialog();

            }
        });

    }

    public void saveorderhistory(){

        new Thread(new Runnable() {
            @Override
            public void run() {

                History orderhistory = new History(randomOrder.getText().toString(),name.getText().toString(),price.getText().toString(),size.getText().toString());
                orderhistorydb.historydao().insertorder(orderhistory);
                toast(getApplicationContext(),"Order Added");
                getAllOrder();

            }
        }).start();

    }

    public void getAllOrder(){

        historyid.clear();
        historyarray.clear();

        new Thread(new Runnable() {
            @Override
            public void run() {

                List<History> orderhistory = orderhistorydb.historydao().getAllHistory();
                String orderinfo;
                for(History history:orderhistory){

                    orderinfo = "ID: " + history.getOrderID() +"\nShoe Name: "
                            +history.getOrder()+"\nPrice: RM" + history.getPrice()
                            +"\nSize: "+history.getSize();

                    historyarray.add(orderinfo);
                    historyid.add(history.getOrderID());

                }

            }
        }).start();

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

    @Override
    protected void onResume() {
        super.onResume();

        getAllOrder();
    }

    private void showOrderSuccessDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(
                R.layout.success_dialog,
                (ViewGroup) findViewById(R.id.alertdialog)
        );

        builder.setView(view);

        alertDialog = builder.create();

        if(alertDialog.getWindow()!=null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            view.findViewById(R.id.buttonback).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(OrderActivity.this,HomePageActivity.class);
                    startActivity(intent);
                }
            });
            alertDialog.show();
        }




    }
}
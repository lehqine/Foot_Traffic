package com.example.foot_traffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class LocationSensor extends AppCompatActivity {

    DrawerLayout drawerlayout;
    ImageView shoeshop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_sensor);

        drawerlayout = findViewById(R.id.drawer_layout);
        shoeshop = findViewById(R.id.img_shop);

        shoeshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri location = Uri.parse("https://www.google.com.my/maps/place/Pavilion+Kuala+Lumpur/@3.1488558,101.7132547,15z/data=!4m2!3m1!1s0x0:0xed966c50b0a79fb4?sa=X&ved=2ahUKEwi3if_cjqr1AhW0SWwGHYWdBPkQ_BJ6BAgmEAU");

                Intent locationIntent = new Intent(Intent.ACTION_VIEW, location);

                if(locationIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(locationIntent);
                }
                else{
                    Toast.makeText(LocationSensor.this,"Sorry, no app can handle this action and data", Toast.LENGTH_SHORT).show();
                }
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
        recreate();
    }

    public void ClickMyAccount(View view){
        HomePageActivity.redirectActivity(this,MyAccount.class);
    }

    public void ClickSetting(View view){
        HomePageActivity.redirectActivity(this,Setting.class);
    }

    public void ClickOrderHistory(View view){
        HomePageActivity.redirectActivity(this,OrderHistory.class);
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
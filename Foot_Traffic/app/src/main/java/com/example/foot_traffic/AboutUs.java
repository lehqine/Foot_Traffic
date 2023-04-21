package com.example.foot_traffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        drawerlayout = findViewById(R.id.drawer_layout);
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
        recreate();
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
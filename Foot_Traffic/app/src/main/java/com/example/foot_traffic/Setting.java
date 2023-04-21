package com.example.foot_traffic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

public class Setting extends AppCompatActivity {

    DrawerLayout drawerlayout;
    LinearLayout ll_setting_darkmode;
    Switch switch_dark;

    SharedPreferences sharePref;
    SharedPreferences.Editor editor;

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        drawerlayout = findViewById(R.id.drawer_layout);
        ll_setting_darkmode = findViewById(R.id.ll_settingdarkmode);
        switch_dark = findViewById(R.id.switch_darkmode);

        sharePref = getSharedPreferences("app_settings", MODE_PRIVATE);
        editor = sharePref.edit();

        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            switch_dark.setChecked(true);
        }

        switch_dark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
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
        HomePageActivity.redirectActivity(this,LocationSensor.class);
    }

    public void ClickMyAccount(View view){
        HomePageActivity.redirectActivity(this,MyAccount.class);
    }

    public void ClickSetting(View view){
        recreate();
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
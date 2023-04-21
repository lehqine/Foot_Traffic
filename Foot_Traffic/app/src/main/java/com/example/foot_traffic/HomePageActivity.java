package com.example.foot_traffic;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.foot_traffic.adapter.HomePageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;

public class HomePageActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private DrawerLayout drawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        drawerlayout = findViewById(R.id.drawer_layout);

        tabLayout.setupWithViewPager(viewPager);

        HomePageAdapter homePageAdapter = new HomePageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        homePageAdapter.addFragment(new FragmentMen(),"MEN");
        homePageAdapter.addFragment(new FragmentWomen(),"WOMEN");
        homePageAdapter.addFragment(new FragmentKids(),"KIDS");

        viewPager.setAdapter(homePageAdapter);
    }
    public void ClickMenu(View view){
        openDrawer(drawerlayout);
    }

    public static void openDrawer(DrawerLayout drawerlayout) {
        drawerlayout.openDrawer(GravityCompat.START);
    }

    public void ClickProfile(View view){
        closeDrawer(drawerlayout);
    }

    public static void closeDrawer(DrawerLayout drawerlayout) {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome(View view){
        recreate();
    }

    public void ClickAboutUs(View view){
        redirectActivity(this,AboutUs.class);
    }

    public void ClickSetting(View view){
        redirectActivity(this,Setting.class);
    }

    public void ClickOrderHistory(View view){
        redirectActivity(this,OrderHistory.class);
    }

    public void ClickHelp(View view){
        redirectActivity(this,Help.class);
    }

    public void ClickMyAccount(View view){
        redirectActivity(this,MyAccount.class);
    }

    public void ClickLocationSensor(View view){
        redirectActivity(this,LocationSensor.class);
    }

    public void ClickLogOut(View view){
        logout(this);
    }

    public static void logout(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                FirebaseAuth.getInstance().signOut();

                redirectActivity(activity,MainActivity.class);

                System.exit(0);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity,aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();

        closeDrawer(drawerlayout);
    }
}
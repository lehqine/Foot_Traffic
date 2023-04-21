package com.example.foot_traffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foot_traffic.adapter.HelpAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class Help extends AppCompatActivity {

    DrawerLayout drawerlayout;
    FloatingActionButton btncontact, btnemail;
    private TabLayout helptb;
    private ViewPager helpvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        drawerlayout = findViewById(R.id.drawer_layout);
        btncontact = findViewById(R.id.btn_contact);
        btnemail = findViewById(R.id.btn_email);
        helptb = findViewById(R.id.tablayout_help);
        helpvp = findViewById(R.id.viewpager_help);

        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel: 0124376589"));

                if(callIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(callIntent);
                }
                else{
                    Toast.makeText(Help.this,"Sorry, no app can handle this action and data", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Question");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message: Enter your question here.");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"foottraffic@company.com"});

                if(emailIntent.resolveActivity(getPackageManager())!=null){
                    startActivity(emailIntent);
                }
                else{
                    Toast.makeText(Help.this,"Sorry, no app can handle this action and data", Toast.LENGTH_SHORT).show();
                }
            }
        });

        helptb.setupWithViewPager(helpvp);

        HelpAdapter helpadap = new HelpAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        helpadap.addfragment(new helpfragment1(),"ORDER");
        helpadap.addfragment(new helpfragment2(),"DELIVERY");
        helpadap.addfragment(new helpfragment3(),"REFUND");
        helpvp.setAdapter(helpadap);

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
        recreate();
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
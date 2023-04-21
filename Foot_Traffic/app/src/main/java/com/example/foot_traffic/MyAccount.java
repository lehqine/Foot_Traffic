package com.example.foot_traffic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyAccount extends AppCompatActivity {

    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
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
        setContentView(R.layout.activity_my_account);

        drawerlayout = findViewById(R.id.drawer_layout);
        user= FirebaseAuth.getInstance().getCurrentUser();
        reference= FirebaseDatabase.getInstance().getReference("Users");
        userID=user.getUid();
        final TextView fullnametv= (TextView) findViewById(R.id.FullName);
        final TextView emailtv= (TextView) findViewById(R.id.EmailAddress);
        final TextView agetv= (TextView) findViewById(R.id.Age);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile= snapshot.getValue(User.class);

                if(userProfile!=null){
                    String fullName=userProfile.fullName;
                    String email=userProfile.email;
                    String age=userProfile.age;

                    fullnametv.setText(fullName);
                    emailtv.setText(email);
                    agetv.setText(age);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(MyAccount.this,"Something wrong happened", Toast.LENGTH_LONG).show();

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
        recreate();
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
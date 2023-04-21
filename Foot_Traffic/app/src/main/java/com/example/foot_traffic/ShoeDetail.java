package com.example.foot_traffic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class ShoeDetail extends AppCompatActivity {

    ImageView shoeimage;
    TextView category, name, text, price;
    TabLayout tabSize;
    EditText size;

    String mID,mImage,mCategory,mName,mText,mPrice,mSize;

    Button buttonbuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Dark);
        }
        else{
            setTheme(R.style.Theme_Light);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_detail);

        shoeimage = findViewById(R.id.imageDetails);
        category = findViewById(R.id.category_details);
        name = findViewById(R.id.name);
        text = findViewById(R.id.textDetails);
        price = findViewById(R.id.price);
        buttonbuy = findViewById(R.id.buttonBuy);
        size =findViewById(R.id.textSize);
        tabSize = findViewById(R.id.tabLayout);

        mID = getIntent().getStringExtra("ShoeID");
        mImage = getIntent().getStringExtra("Image");
        mCategory = getIntent().getStringExtra("Category");
        mName = getIntent().getStringExtra("Name");
        mText = getIntent().getStringExtra("Description");
        mPrice = getIntent().getStringExtra("Price");

        category.setText(mCategory);
        name.setText(mName);
        text.setText(mText);
        price.setText("RM "+mPrice);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int Image = bundle.getInt("Image");
            shoeimage.setImageResource(Image);
            Intent i = getIntent();
            int images=i.getIntExtra("Image",0);

            tabSize.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    switch (tab.getPosition()){
                        case 1:
                            size.setText("37");
                            return;
                        case 2:
                            size.setText("38");
                            return;
                        case 3:
                            size.setText("39");
                            return;
                        case 4:
                            size.setText("40");
                            return;
                        default:
                            size.setText("36");
                            return;

                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

            buttonbuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mSize=size.getText().toString();
                    Intent i=new Intent(getApplicationContext(),OrderActivity.class);
                    i.putExtra("Name", mName);
                    i.putExtra("Price", mPrice);
                    i.putExtra("Size", mSize);
                    startActivity(i);
                }

            });



        }

    }
}
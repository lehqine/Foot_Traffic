package com.example.foot_traffic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foot_traffic.adapter2.MainRecyclerAdapter;
import com.example.foot_traffic.model.AllCategory;
import com.example.foot_traffic.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class KHushPuppiesNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.hpboy_bridgeport3,"HP Boy Bridge Port 3","77.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Boy"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.hpboy_gavin,"HP Boy Gavin","49.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Boy"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.hpboy_jace,"HP Boy Jace","56.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Boy"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.hpboy_tyoxford,"HP Boy Tyoxford","88.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Boy"));

        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.hpgirl_josie,"HP Girl Josie","55.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Girl"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.hpgirl_lexi,"HP Girl Lexi","78.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Girl"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.hpgirl_reesemaryjane,"HP Girl Reesemary Jane","79.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Hush Puppies: Girl"));


        List<AllCategory> AllCategorylist = new ArrayList();
        AllCategorylist.add(new AllCategory("Boys",CategoryItemList));
        AllCategorylist.add(new AllCategory("Girls",CategoryItemList2));

        setMainCategoryRecycler(AllCategorylist);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
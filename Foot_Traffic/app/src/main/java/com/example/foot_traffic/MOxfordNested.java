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

public class MOxfordNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> OxfordItemList = new ArrayList<>();
        OxfordItemList.add(new CategoryItem(1,R.drawable.pedro_burnished,"Pedro Burnished","231.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Pedro"));
        OxfordItemList.add(new CategoryItem(1,R.drawable.pedro_leather,"Pedro Leather","187.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Pedro"));
        OxfordItemList.add(new CategoryItem(1,R.drawable.pedro_lighweight,"Pedro Lighweight","122.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Pedro"));
        OxfordItemList.add(new CategoryItem(1,R.drawable.pedro_texture,"Pedro Texture","211.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Pedro"));



        //2nd category
        List<CategoryItem> OxfordItemList2 = new ArrayList<>();
        OxfordItemList2.add(new CategoryItem(1,R.drawable.farfetch__scarosso,"Farfetch Scarosso","266.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Farfetch"));
        OxfordItemList2.add(new CategoryItem(1,R.drawable.farfetch_brunello,"Farfetch Brunello","177.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Farfetch"));
        OxfordItemList2.add(new CategoryItem(1,R.drawable.farfetch_ferragamo,"Farfetch_Ferragamo","311.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Farfetch"));
        OxfordItemList2.add(new CategoryItem(1,R.drawable.farfetch_santoni,"Farfetch Santoni","229.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Oxford: Farfetch"));



        List<AllCategory> OxfordCategoryList = new ArrayList();
        OxfordCategoryList.add(new AllCategory("Pedro",OxfordItemList));
        OxfordCategoryList.add(new AllCategory("Farfetch",OxfordItemList2));


        setMainCategoryRecycler(OxfordCategoryList);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
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

public class MNikeNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> NikeItemList = new ArrayList<>();
        NikeItemList.add(new CategoryItem(1,R.drawable.lifestyle_airforce,"Man Lifestyle Airforce","493.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.lifestyle_airmax,"Man Lifestyle Airmax","225.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.lifestyle_dunkhigh,"Man Lifestyle Dunkhigh","277.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.lifestyle_lebron,"Man Lifestyle Lebron","199.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.lifestyle_uptempo,"Man Lifestyle Uptempo","292.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));


        //2nd category
        List<CategoryItem> NikeItemList2 = new ArrayList<>();
        NikeItemList2.add(new CategoryItem(1,R.drawable.jordan_ma2,"Man Jordan MA2","239.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Jordan"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.jordan_series_es,"Man Jordan Series ES","344.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Jordan"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.jordan_xxxv,"Man Jordan XXXV","367.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Jordan"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.jordan_zoom,"Man Jordan Zoom","542.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Jordan"));


        //3rd category
        List<CategoryItem> NikeItemList3 = new ArrayList<>();
        NikeItemList3.add(new CategoryItem(1,R.drawable.basketball_flyby_mid_3,"Man Basketball Flyby Mid 3","299.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.basketball_giannis,"Man Basketball Giannis","275.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.basketball_kd14,"Man Basketball KD14","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.basketball_kyrieinfinity,"Man Basketball Kyrie Infinity","333.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));

        //4th category
        List<CategoryItem> NikeItemList4 = new ArrayList<>();
        NikeItemList4.add(new CategoryItem(1,R.drawable.football_mercurial,"Man Mercurial","356.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Football"));
        NikeItemList4.add(new CategoryItem(1,R.drawable.football_mercurialvapor,"Man Mercurial Vapor","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Football"));
        NikeItemList4.add(new CategoryItem(1,R.drawable.football_phantomacademy,"Man Phantom Academy","253.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Football"));
        NikeItemList4.add(new CategoryItem(1,R.drawable.football_phantomelite,"Man Phantom Elite ","349.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Football"));



        List<AllCategory> NikeCategoryList = new ArrayList();
        NikeCategoryList.add(new AllCategory("Lifestyle",NikeItemList));
        NikeCategoryList.add(new AllCategory("Jordan",NikeItemList2));
        NikeCategoryList.add(new AllCategory("Basketball",NikeItemList3));
        NikeCategoryList.add(new AllCategory("Football",NikeItemList4));


        setMainCategoryRecycler(NikeCategoryList);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
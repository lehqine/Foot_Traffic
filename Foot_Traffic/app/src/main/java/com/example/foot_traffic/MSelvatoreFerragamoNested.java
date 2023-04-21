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

public class MSelvatoreFerragamoNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> SFItemList = new ArrayList<>();
        SFItemList.add(new CategoryItem(1,R.drawable.boot_combat,"SF Man Boot Combat","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boots"));
        SFItemList.add(new CategoryItem(1,R.drawable.boot_desert,"SF Man Boot Desert","166.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boots"));
        SFItemList.add(new CategoryItem(1,R.drawable.boot_rain,"SF Man Boot Rain","197.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boots"));
        SFItemList.add(new CategoryItem(1,R.drawable.boot_sportydesert,"SF Man Boot Sporty Desert","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boots"));


        //2nd category
        List<CategoryItem> SFItemList2 = new ArrayList<>();
        SFItemList2.add(new CategoryItem(1,R.drawable.sneaker_gancini,"SF Man Sneaker Gancini","209.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Sneakers"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sneaker1,"SF Man Sneaker 1","229.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Sneakers"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sneaker2,"SF Man Sneaker 2","298.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Sneakers"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sneaker3,"SF Man Sneaker 3","314.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Sneakers"));


        //3rd category
        List<CategoryItem> SFItemList3 = new ArrayList<>();
        SFItemList3.add(new CategoryItem(1,R.drawable.driver__vara,"SF Man Driver Vara","239.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Drivers"));
        SFItemList3.add(new CategoryItem(1,R.drawable.driver_gancini,"SF Man Driver Gancini","276.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Drivers"));
        SFItemList3.add(new CategoryItem(1,R.drawable.driver_sf,"SF Man Driver SF","199.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Drivers"));
        SFItemList3.add(new CategoryItem(1,R.drawable.driver_signatur,"SF Man Driver Signature","221.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Drivers"));



        List<AllCategory> SFCategoryList = new ArrayList();
        SFCategoryList.add(new AllCategory("Boots",SFItemList));
        SFCategoryList.add(new AllCategory("Sneakers",SFItemList2));
        SFCategoryList.add(new AllCategory("Drivers",SFItemList3));

        setMainCategoryRecycler(SFCategoryList);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
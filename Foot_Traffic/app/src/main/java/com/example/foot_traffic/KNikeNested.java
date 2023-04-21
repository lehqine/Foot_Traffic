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

public class KNikeNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_airforce1,"Nike Kid Bold Airforce 1","123.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_airmax90,"Nike Kid Bold Airmax 90 ","134.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_airmaxdawn,"Nike Kid Bold Airmaxdawn ","69.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_blazerlow,"Nike Kid Bold Blazerlow ","99.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_flexrunner,"Nike Kid Bold Flexrunner ","83.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.nikekidbold_kyrieinfinity,"Nike Kid Bold Kyrie Infinity","76.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Older"));



        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_dynamogo,"Nike Kid Young Dynamogo","112.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_flexadvance,"Nike Kid Young Flexadvance","117.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_force1,"Nike Kid Young Force 1","110.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_jordan6retro,"Nike Kid Young Jordan 6 retro","76.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_revolution6,"Nike Kid Young Revolution 6 ","89.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.nikekidyoung_starrunner,"Nike Kid Young Starrunner","88.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Younger"));


        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_flexadvance,"Nike Baby Flexadvance","66.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_force,"Nike Baby Force","59.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_force1,"Nike Baby Force 1","73.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_nikecourtlegacy,"Nike baby Nikecourt Legacy","87.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_pico,"Nike Baby Pico","78.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.nikebaby_forcespacejam,"Nike Baby Forcespace Jam","119.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Baby & Toddler"));


        List<AllCategory> NikeCategoryList = new ArrayList();
        NikeCategoryList.add(new AllCategory("Older Kid",CategoryItemList));
        NikeCategoryList.add(new AllCategory("Younger Kid",CategoryItemList2));
        NikeCategoryList.add(new AllCategory("Baby & Toddler",CategoryItemList3));


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
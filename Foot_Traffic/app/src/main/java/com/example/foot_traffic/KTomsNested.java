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

public class KTomsNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas1,"Toms Alpargatas 1","84.60","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas_glimmer,"Toms Alpargatas Glimmer","117.10","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas_heart,"Toms Alpargatas Heart","81.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas_leapord,"Toms Alpargatas Leopard","72.70","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas_winter,"Toms Alpargatas Winter","89.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.tomalpargatas_woodland,"Toms Alpargatas Woodland","77.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Alpargatas"));

        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.tomsneaker_botas,"Toms Sneaker Botas","62.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Sneaker"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.tomsneaker_cordones,"Toms Sneaker Cordones","44.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Sneaker"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.tomsneaker_cordones2,"Toms Sneaker Cordones 2","65.70","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Sneaker"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.tomsneaker_cordonescupsole,"Toms Sneaker Cordones Cupsole","79.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Sneaker"));

        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.tomsboot_kelsey,"Toms Boot Kelsey","85.20","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Boot & Booties"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.tomsboot_kelsey2,"Toms Boot Kelsey 2","98.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Tom: Boot & Booties"));

        List<AllCategory> AllCategorylist = new ArrayList();
        AllCategorylist.add(new AllCategory("Alpargatas",CategoryItemList));
        AllCategorylist.add(new AllCategory("Sneaker",CategoryItemList2));
        AllCategorylist.add(new AllCategory("Boot & Booties",CategoryItemList3));

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
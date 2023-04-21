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

public class WSelvatoreFerragamoNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> SFItemList = new ArrayList<>();
        SFItemList.add(new CategoryItem(1,R.drawable.sfpump1,"SF Pump 1","216.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Pump"));
        SFItemList.add(new CategoryItem(1,R.drawable.sfpump_doublebow,"SF Pump Doublebow","234.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Pump"));
        SFItemList.add(new CategoryItem(1,R.drawable.sfpump_fheel,"SF Pump Fheel","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Pump"));
        SFItemList.add(new CategoryItem(1,R.drawable.sfpump_mirrorheel,"SF Pump Mirrorheel","188.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Pump"));


        //2nd category
        List<CategoryItem> SFItemList2 = new ArrayList<>();
        SFItemList2.add(new CategoryItem(1,R.drawable.sfboot_ankle,"SF Boot Ankle","189.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boot"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sfboot_fankle,"SF Boot Fankle","200.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boot"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sfboot_gancini,"SF Boot Gancini","209.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boot"));
        SFItemList2.add(new CategoryItem(1,R.drawable.sfboot_vara,"SF Boot Vara","311.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Boot"));


        //3rd category
        List<CategoryItem> SFItemList3 = new ArrayList<>();
        SFItemList3.add(new CategoryItem(1,R.drawable.sfmule_mirror1,"SF Mule Mirror 1","183.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Mules & Slipper"));
        SFItemList3.add(new CategoryItem(1,R.drawable.sfmule_mirror2,"SF Mule Mirror 2","154.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Mules & Slipper"));
        SFItemList3.add(new CategoryItem(1,R.drawable.sfclog_gancini1,"SF Clog Gancini 1","192.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Mules & Slipper"));
        SFItemList3.add(new CategoryItem(1,R.drawable.sfclog_gancini2,"SF Clog Gancini 2","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Selvatore Ferragamo: Mules & Slipper"));


        List<AllCategory> SFCategoryList = new ArrayList();
        SFCategoryList.add(new AllCategory("Pump",SFItemList));
        SFCategoryList.add(new AllCategory("Boot",SFItemList2));
        SFCategoryList.add(new AllCategory("Mules & Slipper",SFItemList3));


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
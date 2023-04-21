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

public class WNikeNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> NikeItemList = new ArrayList<>();
        NikeItemList.add(new CategoryItem(1,R.drawable.nikelifestylew_airjordan1,"Woman Air Jordan 1","257.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.nikelifestylew_dunkhigh,"Woman Dunkhigh","255.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.nikelifestylew_dunklow,"Woman Dunklow","365.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));
        NikeItemList.add(new CategoryItem(1,R.drawable.nikelifestylew_ryz,"Woman RYZ","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Lifestyle"));



        //2nd category
        List<CategoryItem> NikeItemList2 = new ArrayList<>();
        NikeItemList2.add(new CategoryItem(1,R.drawable.nikerunningw_alphafly,"Woman Alphafly","459.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Running"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.nikerunningw_pegasus,"Woman Pegasus","225.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Running"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.nikerunningw_vaporfly,"Woman Vaporfly","254.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Running"));
        NikeItemList2.add(new CategoryItem(1,R.drawable.nikerunningw_zoomrival,"Woman Zoomrival","352.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Running"));


        //3rd category
        List<CategoryItem> NikeItemList3 = new ArrayList<>();
        NikeItemList3.add(new CategoryItem(1,R.drawable.nikebasketballw_kyrieflytrap,"Woman KyrieFly Trap","312.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.nikebasketballw_lebron,"Woman Lebron","386.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.nikebasketballw_pg5,"Woman PG5","359.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));
        NikeItemList3.add(new CategoryItem(1,R.drawable.nikenikebasketballw_giannis,"Woman Giannis","259.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Nike: Basketball"));


        List<AllCategory> NikeCategoryList = new ArrayList();
        NikeCategoryList.add(new AllCategory("Lifestyle",NikeItemList));
        NikeCategoryList.add(new AllCategory("Running",NikeItemList2));
        NikeCategoryList.add(new AllCategory("Basketball",NikeItemList3));


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
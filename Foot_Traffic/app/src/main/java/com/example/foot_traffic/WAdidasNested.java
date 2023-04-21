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

public class WAdidasNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> adidasItemList = new ArrayList<>();
        adidasItemList.add(new CategoryItem(1,R.drawable.adidasw_continental80,"Adidas Woman Continental 80","355.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneakers"));
        adidasItemList.add(new CategoryItem(1,R.drawable.adidasw_stansmith,"Adidas Woman Stansmith","299.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneakers"));
        adidasItemList.add(new CategoryItem(1,R.drawable.adidasw_superstar,"Adidas Woman Superstar","269.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneakers"));
        adidasItemList.add(new CategoryItem(1,R.drawable.adidasw_ultraboost,"Adidas Woman Ultraboost","359.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneakers"));


        //2nd category
        List<CategoryItem> adidasItemList2 = new ArrayList<>();
        adidasItemList2.add(new CategoryItem(1,R.drawable.adslide_bonega,"Adidas Woman Slide Bonega","367.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.adslide_flipflop,"Adidas Woman Slide Flipflop","286.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.adslide_lite,"Adidas Woman Slide Lite","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.adslide_shower,"Adidas Woman Slide Shower","299.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));

        //3rd category
        List<CategoryItem> adidasItemList3 = new ArrayList<>();
        adidasItemList3.add(new CategoryItem(1,R.drawable.adfootballw_copa,"Adidas Woman Copa","312.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.adfootballw_gamemode,"Adidas Woman Gamemode","366.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.adfootballw_golleto,"Adidas Woman Golleto","345.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.adfootballw_speedflow,"Adidas Woman Speedflow","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football"));


        List<AllCategory> adidasCategorylist = new ArrayList();
        adidasCategorylist.add(new AllCategory("Sneakers",adidasItemList));
        adidasCategorylist.add(new AllCategory("Slides & Flip Flop",adidasItemList2));
        adidasCategorylist.add(new AllCategory("Football ",adidasItemList3));

        setMainCategoryRecycler(adidasCategorylist);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
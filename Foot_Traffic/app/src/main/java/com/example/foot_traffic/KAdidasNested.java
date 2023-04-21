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

public class KAdidasNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_dame,"Adidas Youth Dame","89.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_forumlow,"Adidas Youth ForumLow","69.30","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_ozweego,"Adidas Youth Ozweego","49.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_superstar,"Adidas Youth Superstar","45.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_ultraboost,"Adidas Youth Ultraboost","64.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.adidasyouth_zx2kboost,"Adidas Youth ZX2K Boost","65.40","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Youth"));


        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_disney,"Adidas Kid Disney","83.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_marvel,"Adidas Kid Marvel","132.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_superstar360,"Adidas Kid Superstar 360","144.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_tensaur,"Adidas Kid Tensaur","97.30","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_superstar360primeblue,"Adidas Kid Superstar 360 Primeblue","89.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.adidaskid_superstarlego,"Adidas Kid Superstar Lego","143.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Kids"));

        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.adidasbaby_disney,"Adidas Baby Disney","77.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.adidasbaby_disneysuperstar,"Adidas Baby Disney Superstar","98.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.adidasbaby_superstar,"Adidas Baby Superstar","55.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Baby & Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.adidasbaby_superstar,"Adidas Baby Superstar","88.00","A good shoe for regular use as well as sports." +
                "The shoe is lightweight and built of high-quality materials." +
                "Choose the shoe that best suits your needs.","Adidas: Baby & Toddler"));

        List<AllCategory> adidasCategorylist = new ArrayList();
        adidasCategorylist.add(new AllCategory("Youth",CategoryItemList));
        adidasCategorylist.add(new AllCategory("Kids",CategoryItemList2));
        adidasCategorylist.add(new AllCategory("Baby & Toddler",CategoryItemList3));

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
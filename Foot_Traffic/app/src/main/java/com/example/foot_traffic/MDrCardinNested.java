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

public class MDrCardinNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> drcardinItemList = new ArrayList<>();
        drcardinItemList.add(new CategoryItem(1,R.drawable.sandal_comfortairslide,"DC Sandal Comfortair Slide","221.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sandal"));
        drcardinItemList.add(new CategoryItem(1,R.drawable.sandal_homecomfort,"DC Sandal Home Comfort","212.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sandal"));
        drcardinItemList.add(new CategoryItem(1,R.drawable.sandal_phylonoutsole,"DC Sandal Phylonoutsole","244.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sandal"));
        drcardinItemList.add(new CategoryItem(1,R.drawable.sandal_phylonoutsole2,"DC Sandal Phylonoutsole 2","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sandal"));

        //2nd category
        List<CategoryItem> drcardinItemList2 = new ArrayList<>();
        drcardinItemList2.add(new CategoryItem(1,R.drawable.sneaker_jetaire,"DC Sneaker Jetaire","118.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sneakers"));
        drcardinItemList2.add(new CategoryItem(1,R.drawable.sneaker_jetaireslipon,"DC Sneaker Jetaire Slipon","288.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sneakers"));
        drcardinItemList2.add(new CategoryItem(1,R.drawable.sneaker_microsuede,"DC Sneaker Microsuede","159.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sneakers"));
        drcardinItemList2.add(new CategoryItem(1,R.drawable.sneaker_unisexlaceup,"DC Sneaker Unisex Laceup","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Sneakers"));

        //3rd category
        List<CategoryItem> drcardinItemList3 = new ArrayList<>();
        drcardinItemList3.add(new CategoryItem(1,R.drawable.formal_faux,"DC Man Formal Faux","236.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Formal"));
        drcardinItemList3.add(new CategoryItem(1,R.drawable.formal_fauxlaceup,"DC Man Formal Faux Laceup","212.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Formal"));
        drcardinItemList3.add(new CategoryItem(1,R.drawable.formal_fauxslipon,"DC Man Formal Faux Slipon","188.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Formal"));
        drcardinItemList3.add(new CategoryItem(1,R.drawable.formal_signature,"DC Man Formal Signature","169.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Dr Cardin: Formal"));


        List<AllCategory> drcardinCategoryList = new ArrayList();
        drcardinCategoryList.add(new AllCategory("Sandal",drcardinItemList));
        drcardinCategoryList.add(new AllCategory("Sneakers",drcardinItemList2));
        drcardinCategoryList.add(new AllCategory("Formal",drcardinItemList3));

        setMainCategoryRecycler(drcardinCategoryList);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
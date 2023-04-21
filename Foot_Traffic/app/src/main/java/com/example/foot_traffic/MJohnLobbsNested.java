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

public class MJohnLobbsNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> JLItemList = new ArrayList<>();
        JLItemList.add(new CategoryItem(1,R.drawable.trainer_foundry,"JL Trainer Foundry","276.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Trainer"));
        JLItemList.add(new CategoryItem(1,R.drawable.trainer_foundry2,"JL Trainer Foundry 2","233.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Trainer"));
        JLItemList.add(new CategoryItem(1,R.drawable.trainer_haven,"JL Trainer Haven ","129.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Trainer"));
        JLItemList.add(new CategoryItem(1,R.drawable.trainer_porth,"JL Trainer Porth","211.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Trainer"));


        //2nd category
        List<CategoryItem> JLItemList2 = new ArrayList<>();
        JLItemList2.add(new CategoryItem(1,R.drawable.iconic_alder,"JL Iconic Alder","259.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Iconic"));
        JLItemList2.add(new CategoryItem(1,R.drawable.iconic_becket,"JL Iconic Becket","177.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Iconic"));
        JLItemList2.add(new CategoryItem(1,R.drawable.iconic_lopez,"JL Iconic Lopez","196.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Iconic"));
        JLItemList2.add(new CategoryItem(1,R.drawable.iconic_william,"JL Iconic William","115.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","John Lobbs: Iconic"));


        List<AllCategory> JLCategoryList = new ArrayList();
        JLCategoryList.add(new AllCategory("Trainer",JLItemList));
        JLCategoryList.add(new AllCategory("Iconic",JLItemList2));



        setMainCategoryRecycler(JLCategoryList);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
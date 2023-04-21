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

public class WSergioRossiNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.srboot_cindy,"SR Boot Cindy","213.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Boot"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.srboot_cris,"SR Boot Cris","299.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Boot"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.srboot_grazie,"SR Boot Grazie","229.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Boot"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.srboot_prince,"SR Boot Prince","311.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Boot"));

        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.srsandal_godiva,"SR Sandal Godiva","233.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sandal"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.srsandal_grazie,"SR Sandal Grazie","292.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sandal"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.srsandal_monica,"SR Sandal Monica","199.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sandal"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.srsandal_sr1,"SR Sandal SR 1","169.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sandal"));

        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.srsneaker_addict,"SR Sneaker Addict","277.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sneaker"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.srsneaker_extreme,"SR Sneaker Extreme","195.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sneaker"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.srsneaker_running,"SR Sneaker Running","229.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sneaker"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.srsneaker_running2,"SR Sneaker Running 2","188.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Sergio Rossi: Sneaker"));


        List<AllCategory> AllCategorylist = new ArrayList();
        AllCategorylist.add(new AllCategory("Boot",CategoryItemList));
        AllCategorylist.add(new AllCategory("Sandal",CategoryItemList2));
        AllCategorylist.add(new AllCategory("Sneaker",CategoryItemList3));

        setMainCategoryRecycler(AllCategorylist );
    }
    private void setMainCategoryRecycler(List<AllCategory> CategoryItem){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,CategoryItem);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
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

public class WAldoNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.aldosandal_kristen,"Aldo Sandal Kristen","172.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Sandal"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.aldosandal_rachelle,"Aldo Sandal Rachelle","211.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Sandal"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.aldosandal_righton,"Aldo Sandal Righton","198.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Sandal"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.aldosandal_zarewen,"Aldo Sandal Zarewen","144.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Sandal"));


        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.aldoheel_afean,"Aldo Heel Afean","187.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Heel"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.aldoheel_biliwen,"Aldo Heel Biliwen","143.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Heel"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.aldoheel_civet,"Aldo Heel Civet","186.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Heel"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.aldoheel_drena,"Aldo Heel Drena","212.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Heel"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.aldoheel_polly,"Aldo Heel Polly","259.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Heel"));


        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.aldoflat_braylynn,"Aldo Flat Braylynn","177.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Flat"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.aldoflat_feari,"Aldo Flat Feari","217.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Flat"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.aldoflat_koosaflex,"Aldo Flat Koosa Flex","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Flat"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.aldoflat_pridiaflex,"Aldo Flat Pridia Flex","289.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Aldo: Flat"));


        List<AllCategory> AldoCategorylist = new ArrayList();
        AldoCategorylist.add(new AllCategory("Sandal",CategoryItemList));
        AldoCategorylist.add(new AllCategory("Heel",CategoryItemList2));
        AldoCategorylist.add(new AllCategory("Flat",CategoryItemList3));

        setMainCategoryRecycler(AldoCategorylist);
    }
    private void setMainCategoryRecycler(List<AllCategory> CategoryItem){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,CategoryItem);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
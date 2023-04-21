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

public class MAdidasNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> adidasItemList = new ArrayList<>();
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_continental80,"Man Sneaker Continental 80","334.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_forumlow,"Man Sneaker Forumlow","259.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_stansmith,"Man Sneaker Stansmith","159.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_superstar,"Man Sneaker Superstar","249.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_ultraboost_22,"Man Sneaker Ultraboost 22","277.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));
        adidasItemList.add(new CategoryItem(1,R.drawable.sneaker_ultrahuricane,"Man Sneaker Ultrahuricane","224.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Sneaker"));


        //2nd category
        List<CategoryItem> adidasItemList2 = new ArrayList<>();
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_adilette,"Man Slide Adilette","384.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_adiletteaqua,"Man Slide Adilette Aqua","367.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_adilettecomfort,"Man Slide Adilette Comfort","125.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_duramosl,"Man Slide Duramosl","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_terrexcyprex,"Man Slide Terrexcyprex","289.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));
        adidasItemList2.add(new CategoryItem(1,R.drawable.slide_terrexsumra,"Man Slide Terrexsumra","259.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Slides & Flip Flop"));

        //3rd category
        List<CategoryItem> adidasItemList3 = new ArrayList<>();
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_copasence,"Man Football Copasence","287.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_golleto,"Man Football Golleto","233.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_predatorfreak1,"Man Football Predator Freak 4","214.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_predatorfreak4,"Man Football Predator Freak 4","123.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_topsala,"Man Football Topsala","333.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));
        adidasItemList3.add(new CategoryItem(1,R.drawable.football_xspeedflow,"Man Football X Speedflow","344.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Football Boots"));

        //4th category
        List<CategoryItem> adidasItemList4 = new ArrayList<>();
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_adicrosszx,"Man Adidas Adicross ZX","365.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_adidas4dfwd,"Man Adidas 4DFWD","245.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_adissage,"Man Adidas Adissage","211.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_ultraboost,"Man Adidas Ultraboos","234.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_zg21,"Man Adidas ZG21","355.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));
        adidasItemList4.add(new CategoryItem(1,R.drawable.other_ultraseundevil,"Man Adidas Ultraseun Devil","159.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Adidas: Other Sport Shoes"));

        List<AllCategory> adidasCategorylist = new ArrayList();
        adidasCategorylist.add(new AllCategory("Sneakers",adidasItemList));
        adidasCategorylist.add(new AllCategory("Slides & Flip Flop",adidasItemList2));
        adidasCategorylist.add(new AllCategory("Football Boots",adidasItemList3));
        adidasCategorylist.add(new AllCategory("Other Sport Shoes",adidasItemList4));

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
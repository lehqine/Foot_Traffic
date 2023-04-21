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

public class WJimmyChooNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.jcpump_aurelie85,"JC Pump Aurelie 85","292.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Pump"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.jcpump_cass95,"JC Pump Cass 95","100.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Pump"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.jcpump_saeda100,"JC Pump Saeda 100","199.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Pump"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.jcpump_scotty110,"JC Pump Scotty 110","229.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Pump"));

        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.jcboot_eshe,"JC Boot Eshe","287.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Boot"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.jcboot_kai,"JC Boot Kai","222.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Boot"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.jcboot_wanaka,"JC Boot Wanaka","212.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Boot"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.jcboot_youth,"JC Boot Youth","198.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Boot"));

        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.jcslipper_acinda,"JC Slipper Acinda","219.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Slipper"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.jcslipper_aliette,"JC Slipper Aliette","200.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Slipper"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.jcslipper_bardo,"JC Slipper Bardo","166.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Jimmy Choo: Slipper"));


        List<AllCategory> AllCategorylist = new ArrayList();
        AllCategorylist.add(new AllCategory("Pump",CategoryItemList));
        AllCategorylist.add(new AllCategory("Boot",CategoryItemList2));
        AllCategorylist.add(new AllCategory("Slipper",CategoryItemList3));

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
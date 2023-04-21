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

public class KKeenNested extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        //1st category
        List<CategoryItem> CategoryItemList = new ArrayList<>();
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_greta,"Keen Big Greta","38.50","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_howser,"Keen Big Howser","45.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_knotch,"Keen Big Knotch","94.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_verano,"Keen Big Verano","46.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_newport,"Keen Big Newport","74.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));
        CategoryItemList.add(new CategoryItem(1,R.drawable.keenbig_knotchriver,"Keen Big Knotchriver","86.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Big"));

        //2nd category
        List<CategoryItem> CategoryItemList2 = new ArrayList<>();
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_howserwrap,"Keen Little Howserwrap","73.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_jasper,"Keen Little Jasper","86.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_knotchcreek,"Keen Little Knotchcreek","67.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_knotchriver,"Keen Little Knotchriver","65.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_newport,"Keen Little Newport","77.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));
        CategoryItemList2.add(new CategoryItem(1,R.drawable.keenlittle_traghee,"Keen Little Traghee","79.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Little"));

        //3rd category
        List<CategoryItem> CategoryItemList3 = new ArrayList<>();
        CategoryItemList3.add(new CategoryItem(1,R.drawable.keenbaby_chandler,"Keen Baby Chandler","66.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.keenbaby_knotchhollow,"Keen Baby Knotchhollow","59.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.keenbaby_seacamp,"Keen Baby Seacamp","87.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.keenbaby_moxie,"Keen Baby Moxie","46.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Toddler"));
        CategoryItemList3.add(new CategoryItem(1,R.drawable.keenbaby_newport,"Keen Baby Newport","67.00","A good shoe for regular use as well as sports.\n" +
                "The shoe is lightweight and built of high-quality materials.\n" +
                "Choose the shoe that best suits your needs.","Keen: Toddler"));

        List<AllCategory> AllCategorylist = new ArrayList();
        AllCategorylist.add(new AllCategory("Big Kid",CategoryItemList));
        AllCategorylist.add(new AllCategory("Little Kid",CategoryItemList2));
        AllCategorylist.add(new AllCategory("Toddler",CategoryItemList3));

        setMainCategoryRecycler(AllCategorylist);
    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this,allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }
}
package com.example.foot_traffic.model;

import java.util.List;

public class AllCategory {

    String categoryTitle;
    List<CategoryItem> categoryItemList;


    public AllCategory(String categoryTitle, List<CategoryItem> categoryItemList) {
        this.categoryTitle = categoryTitle;
        this.categoryItemList = categoryItemList;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }
}

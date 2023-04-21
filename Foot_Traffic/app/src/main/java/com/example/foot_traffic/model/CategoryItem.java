package com.example.foot_traffic.model;

public class CategoryItem {

    Integer itemId;
    Integer imageUrl;
    String name,price,description,category;


    public CategoryItem(Integer itemId, Integer imageUrl,String name,String price,String description, String category) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.price=price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getItemld() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageurl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}

package com.example.foot_traffic.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "OrderHistory")
public class History {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "order_id")
    String orderID;

    @NonNull
    @ColumnInfo(name = "shoe_name")
    String order;

    @NonNull
    @ColumnInfo(name = "shoe_price")
    String price;

    @NonNull
    @ColumnInfo(name = "shoe_size")
    String size;

    public History(String orderID) {
        this.orderID = orderID;
    }

    public History(String orderID, @NonNull String order) {
        this.orderID = orderID;
        this.order = order;
    }

    public History(String orderID, @NonNull String order, @NonNull String price) {
        this.orderID = orderID;
        this.order = order;
        this.price = price;
    }

    public History(String  orderID, @NonNull String order, @NonNull String price, @NonNull String size) {
        this.orderID = orderID;
        this.order = order;
        this.price = price;
        this.size = size;
    }

    public History() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @NonNull
    public String getOrder() {
        return order;
    }

    public void setOrder(@NonNull String order) {
        this.order = order;
    }

    @NonNull
    public String getPrice() {
        return price;
    }

    public void setPrice(@NonNull String price) {
        this.price = price;
    }

    @NonNull
    public String getSize() {
        return size;
    }

    public void setSize(@NonNull String size) {
        this.size = size;
    }
}

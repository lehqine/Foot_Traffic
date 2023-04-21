package com.example.foot_traffic;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.foot_traffic.dao.HistoryDao;
import com.example.foot_traffic.entities.History;

@Database(entities = {History.class},version = 1)
public abstract class MyOrderHistoryDB extends RoomDatabase {

    public abstract HistoryDao historydao();

}

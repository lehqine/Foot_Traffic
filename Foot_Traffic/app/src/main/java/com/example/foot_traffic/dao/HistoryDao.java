package com.example.foot_traffic.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.foot_traffic.OrderHistory;
import com.example.foot_traffic.entities.History;

import java.util.List;

@Dao
public interface HistoryDao {

    @Insert
    void insertorder(History history);

    @Query("Select * from OrderHistory")
    List<History> getAllHistory();

}

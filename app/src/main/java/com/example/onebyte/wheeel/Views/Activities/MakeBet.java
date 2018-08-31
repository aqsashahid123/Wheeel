package com.example.onebyte.wheeel.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.MakeBetAdapter;

import java.util.ArrayList;
import java.util.List;

public class MakeBet extends AppCompatActivity {
    RecyclerView rvData;
    MakeBetAdapter adapter;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_bet);
        list =new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        rvData = (RecyclerView) findViewById(R.id.rvData);
        adapter = new MakeBetAdapter(list,this);
        rvData.setLayoutManager(new LinearLayoutManager(this));
        rvData.setAdapter(adapter);
    }
}

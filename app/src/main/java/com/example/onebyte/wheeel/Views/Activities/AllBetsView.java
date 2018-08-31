package com.example.onebyte.wheeel.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class AllBetsView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_bets_view);
        StatusBarColor.SetColor(this);
    }
}

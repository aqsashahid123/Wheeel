package com.example.onebyte.wheeel.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class AcoountView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acoount_view);
        StatusBarColor.SetColor(this);
    }
}

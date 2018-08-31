package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        StatusBarColor.SetColor(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, SelectLanguage.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

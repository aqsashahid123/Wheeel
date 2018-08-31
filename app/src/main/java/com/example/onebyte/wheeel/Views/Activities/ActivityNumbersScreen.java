package com.example.onebyte.wheeel.Views.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

public class ActivityNumbersScreen extends AppCompatActivity implements View.OnClickListener {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv0,tvTimer;
    CounterClass timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_screen);
        StatusBarColor.SetColor(this);
        tv0 = (TextView) findViewById(R.id.tv0);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);
        tvTimer = (TextView) findViewById(R.id.tvTimer);
        tv0.setOnClickListener(this);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        tv0.setOnClickListener(this);
        int millis =1680000;
        timer = new CounterClass(millis, 1000);
        timer.start();
        tvTimer.setText(String.valueOf((millis)));
    }

    @Override
    public void onClick(View view) {
        if (view==tv0||view==tv1||view==tv2||view==tv3||view==tv4||view==tv5||view==tv6||view==tv7||view==tv8||view==tv9){
            Intent intent = new Intent(getApplicationContext(),MakeBet.class);
            startActivity(intent);
        }
    }
    public class CounterClass extends CountDownTimer {

        public CounterClass(long millisInFuture, long countDownInterval)
        { super(millisInFuture, countDownInterval);
        }
        @Override public void onFinish() {

        }
        @SuppressLint("DefaultLocale")
        @Override
        public void onTick(long millisUntilFinished)
        {
            long millis = millisUntilFinished;
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis), TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)), TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            tvTimer.setText(hms);
        }


    }

}

package com.example.onebyte.wheeel.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

import java.util.ArrayList;
import java.util.List;

import rubikstudio.library.LuckyWheelView;
import rubikstudio.library.model.LuckyItem;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    LuckyWheelView luckyWheelView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        StatusBarColor.SetColor(this);
        luckyWheelView = findViewById(R.id.luckyWheel);
        List<LuckyItem> data = new ArrayList<>();
//        for (int i=0; i<12; i++) {
//
//        }
        LuckyItem luckyItem = new LuckyItem();
        luckyItem.text = "Item " + "123";
        luckyItem.icon = R.drawable.test;
        luckyItem.color = getResources().getColor(R.color.colorAccent);
        data.add(luckyItem);
        LuckyItem luckyItem1 = new LuckyItem();
        luckyItem1.text = "Item " + "123";
        luckyItem1.icon = R.drawable.test;
        luckyItem1.color = getResources().getColor(R.color.colorGreen);
        data.add(luckyItem1);
        LuckyItem luckyItem2 = new LuckyItem();
        luckyItem2.text = "Item " + "123";
        luckyItem2.icon = R.drawable.test;
        luckyItem2.color = getResources().getColor(R.color.colorMustard);
        data.add(luckyItem2);
        LuckyItem luckyItem3 = new LuckyItem();
        luckyItem3.text = "Item " + "123";
        luckyItem3.icon = R.drawable.test;
        luckyItem3.color = getResources().getColor(R.color.colorPrimary);
        data.add(luckyItem3);
        LuckyItem luckyItem4 = new LuckyItem();
        luckyItem4.text = "Item " + "123";
        luckyItem4.icon = R.drawable.test;
        luckyItem4.color = getResources().getColor(R.color.colorPrimaryDark);
        data.add(luckyItem4);
        LuckyItem luckyItem5 = new LuckyItem();
        luckyItem5.text = "Item " + "123";
        luckyItem5.icon = R.drawable.test;
        luckyItem5.color = getResources().getColor(R.color.colorRed);
        data.add(luckyItem5);
        LuckyItem luckyItem6 = new LuckyItem();
        luckyItem6.text = "Item " + "123";
        luckyItem6.icon = R.drawable.test;
        luckyItem6.color = getResources().getColor(R.color.colorAccent);
        data.add(luckyItem6);
        LuckyItem luckyItem7 = new LuckyItem();
        luckyItem7.text = "Item " + "123";
        luckyItem7.icon = R.drawable.test;
        luckyItem7.color = getResources().getColor(R.color.colorGrey);
        data.add(luckyItem7);
        LuckyItem luckyItem8 = new LuckyItem();
        luckyItem8.text = "Item " + "123";
        luckyItem8.icon = R.drawable.test;
        luckyItem8.color = getResources().getColor(R.color.colorOrange);
        data.add(luckyItem8);



        luckyWheelView.setData(data);
        luckyWheelView.setRound(10);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                luckyWheelView.startLuckyWheelWithTargetIndex(5);

            }
        });
// start

// listener after finish lucky wheel
        luckyWheelView.setLuckyRoundItemSelectedListener(new LuckyWheelView.LuckyRoundItemSelectedListener() {
            @Override
            public void LuckyRoundItemSelected(int index) {
                // do something with index
            }
        });
    }
}

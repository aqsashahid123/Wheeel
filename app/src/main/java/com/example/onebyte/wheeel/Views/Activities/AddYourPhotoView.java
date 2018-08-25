package com.example.onebyte.wheeel.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anton46.stepsview.StepsView;
import com.example.onebyte.wheeel.R;

public class AddYourPhotoView extends AppCompatActivity {
    StepsView stepsView;
    String[] arrSteps = {"step1","step2","step3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_your_photo_view);
        stepsView = (StepsView) findViewById(R.id.stepsView);
        stepsView.setLabels(arrSteps)
                .setBarColorIndicator(getResources().getColor(R.color.colorDarkPurple))
                .setProgressColorIndicator(getResources().getColor(R.color.colorWhite))
                .setLabelColorIndicator(getResources().getColor(R.color.colorWhite))
                .setCompletedPosition(1)
                .drawView();
    }
}

package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anton46.stepsview.StepsView;
import com.example.onebyte.wheeel.R;

public class PersonalInfoSignup extends AppCompatActivity implements View.OnClickListener {

    StepsView stepsView;
    String[] arrSteps = {"step1","step2","step3"};
    Button btnNextStep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info_signup);
        stepsView = (StepsView) findViewById(R.id.stepsView);
        btnNextStep = (Button) findViewById(R.id.btnNextStep);
        btnNextStep.setOnClickListener(this);
        stepsView.setLabels(arrSteps)
                .setBarColorIndicator(getResources().getColor(R.color.colorDarkGreen))
                .setProgressColorIndicator(getResources().getColor(R.color.colorWhite))
                .setLabelColorIndicator(getResources().getColor(R.color.colorWhite))
                .setCompletedPosition(0)
                .drawView();
    }

    @Override
    public void onClick(View view) {
        if (view==btnNextStep){
            Intent intent = new Intent(this,AddYourPhotoView.class);
            startActivity(intent);
        }
    }
}

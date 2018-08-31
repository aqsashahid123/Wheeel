package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.anton46.stepsview.StepsView;
import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class GeneralInfoView extends AppCompatActivity implements View.OnClickListener {
    StepsView stepsView;
    String[] arrSteps = {" ", " ", " "};
    String[] items;
    Button btnNextStep;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info_view);
        stepsView = (StepsView) findViewById(R.id.stepsView);
        btnNextStep = (Button) findViewById(R.id.btnNextStep);
        stepsView.setLabels(arrSteps)
                .setBarColorIndicator(getResources().getColor(R.color.colorDarkPurple))
                .setProgressColorIndicator(getResources().getColor(R.color.colorWhite))
                .setLabelColorIndicator(getResources().getColor(R.color.colorWhite))
                .setCompletedPosition(2)
                .drawView();
        btnNextStep.setOnClickListener(this);
        StatusBarColor.SetColor(this);
        Spinner dropdown = findViewById(R.id.tvLanguage);
        items = new String[]{"Language","English", "Hindi", "Arabic"};
        adapter = new ArrayAdapter<>(this, R.layout.dropdown_list_item, items);
        dropdown.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == btnNextStep){
            Intent intent = new Intent(this,PaymentInformationView.class);
            startActivity(intent);
            finish();
        }
    }
}

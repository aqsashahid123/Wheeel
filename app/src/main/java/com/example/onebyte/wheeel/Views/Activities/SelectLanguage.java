package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class SelectLanguage extends AppCompatActivity implements View.OnClickListener {
    Button btnNextStep;
    String[] items;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        btnNextStep = (Button) findViewById(R.id.btnNextStep);
        btnNextStep.setOnClickListener(this);
        StatusBarColor.SetColor(this);
        Spinner dropdown = findViewById(R.id.planets_spinner);
        items = new String[]{"Language","English", "Hindi", "Arabic"};
        adapter = new ArrayAdapter<>(this, R.layout.dropdown_list_item, items);
        dropdown.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view==btnNextStep){
            Intent i = new Intent(SelectLanguage.this,SigninView.class);
            startActivity(i);
        }
    }
}

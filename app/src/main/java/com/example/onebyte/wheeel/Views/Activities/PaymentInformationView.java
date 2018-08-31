package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class PaymentInformationView extends AppCompatActivity implements View.OnClickListener {


    Button btnDone,btnSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_information_view);
        btnDone = (Button) findViewById(R.id.btnDone);
        btnSkip = (Button) findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(this);
        btnDone.setOnClickListener(this);
        StatusBarColor.SetColor(this);

    }

    @Override
    public void onClick(View view) {
        if (view ==btnSkip){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        if (view ==btnDone){
            Intent intent = new Intent(getApplicationContext(),UserProfileViews.class);
            startActivity(intent);
        }
    }
}

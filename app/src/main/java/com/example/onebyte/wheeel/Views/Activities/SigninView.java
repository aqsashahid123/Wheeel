package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

public class SigninView extends AppCompatActivity implements View.OnClickListener {
    Button btnSignup,btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_view);
        btnSignup = (Button) findViewById(R.id.btnSignup);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        setListeners();

        StatusBarColor.SetColor(this);
    }

    private void setListeners() {
        btnSignup.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==btnSignup){
            Intent i = new Intent(SigninView.this,PersonalInfoSignup.class);
            startActivity(i);
        } if (view==btnLogin){
            Intent i = new Intent(SigninView.this,UserProfileViews.class);
            startActivity(i);
        }
    }
}

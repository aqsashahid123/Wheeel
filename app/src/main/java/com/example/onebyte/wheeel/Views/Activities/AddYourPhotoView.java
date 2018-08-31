package com.example.onebyte.wheeel.Views.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.anton46.stepsview.StepsView;
import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.StatusBarColor;

import java.util.Calendar;

public class AddYourPhotoView extends AppCompatActivity implements View.OnClickListener {
    StepsView stepsView;
    String[] arrSteps = {" ", " ", " "};
    RadioButton rbMen, rbWomen;
    Button btnNextStep;
    LinearLayout lldob;
    private int mYear, mMonth, mDay, mHour, mMinute;
    TextView tvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_your_photo_view);
        stepsView = (StepsView) findViewById(R.id.stepsView);
        rbMen = (RadioButton) findViewById(R.id.rbMen);
        tvDate = (TextView) findViewById(R.id.tvDate);
        lldob = (LinearLayout) findViewById(R.id.tvBirthday) ;
        rbWomen = (RadioButton) findViewById(R.id.rbWomen);
        btnNextStep = (Button) findViewById(R.id.btnNextStep);
        stepsView.setLabels(arrSteps)
                .setBarColorIndicator(getResources().getColor(R.color.colorDarkPurple))
                .setProgressColorIndicator(getResources().getColor(R.color.colorWhite))
                .setLabelColorIndicator(getResources().getColor(R.color.colorWhite))
                .setCompletedPosition(1)
                .drawView();
        lldob.setOnClickListener(this);
        rbMen.setChecked(true);
        rbMen.setPressed(true);
        rbMen.setBackground(getResources().getDrawable(R.drawable.active_bg_men));
//        rbMen.setBackground(getResources().getDrawable(R.drawable.active_bg_men));
//        rbMen.setTextColor(getResources().getColor(R.color.colorDarkPurple));
        rbMen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    rbMen.setBackground(getResources().getDrawable(R.drawable.active_bg_men));

                } else {
                    rbMen.setBackground(null);
                }
            }
        });
        rbWomen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    rbWomen.setBackground(getResources().getDrawable(R.drawable.active_bg_women));

                } else {
                    rbWomen.setBackground(null);
                }
            }
        });
        btnNextStep.setOnClickListener(this);
        StatusBarColor.SetColor(this);
    }

    @Override
    public void onClick(View view) {
        if (view==btnNextStep){
            Intent intent = new Intent(this,GeneralInfoView.class);
            startActivity(intent);

        }
        if (view==lldob){
            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            tvDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
    }
}

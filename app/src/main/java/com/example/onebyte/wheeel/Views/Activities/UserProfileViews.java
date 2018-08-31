package com.example.onebyte.wheeel.Views.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.GameDataAdapter;
import com.example.onebyte.wheeel.Views.StatusBarColor;

import java.util.ArrayList;
import java.util.List;

public class UserProfileViews extends AppCompatActivity implements View.OnClickListener {
    RadioButton rbMen, rbWomen;
    FrameLayout fmPlay;
    RecyclerView rvData;
    List<String> list;
    ImageView ivMenu;
    TextView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_views);
        rbMen = (RadioButton) findViewById(R.id.rbMen);
        StatusBarColor.SetColor(this);
        rbWomen = (RadioButton) findViewById(R.id.rbWomen);
        rvData = (RecyclerView) findViewById(R.id.rvData);
        ivMenu = (ImageView) findViewById(R.id.ivMenu);
        fmPlay = (FrameLayout) findViewById(R.id.fmPlay);
        play = (TextView) findViewById(R.id.play);
        ivMenu.setOnClickListener(this);
        play.setOnClickListener(this);
//        android:background="@drawable/bg_white_rectangular"
        fmPlay.setOnClickListener(this);
        rbMen.setChecked(true);
        rbMen.setPressed(true);
        rbMen.setBackground(getResources().getDrawable(R.drawable.active_bg_men));
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
        list = new ArrayList<>();
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        list.add("Boom");
        GameDataAdapter adapter = new GameDataAdapter(list, this);
        rvData.setLayoutManager(new LinearLayoutManager(this));
        rvData.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        if (view == fmPlay) {
            Intent intent = new Intent(getApplicationContext(),ActivityNumbersScreen.class);
            startActivity(intent);
        }if (view == play) {
            Intent intent = new Intent(getApplicationContext(),ActivityNumbersScreen.class);
            startActivity(intent);
        }
        if (view == ivMenu) {
            final PopupMenu popup = new PopupMenu(UserProfileViews.this, ivMenu);
            //Inflating the Popup using xml file
            popup.getMenuInflater().inflate(R.menu.logout_menu, popup.getMenu());

            //registering popup with OnMenuItemClickListener
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    if (item.getItemId() == R.id.account) {
                        popup.dismiss();
                    }if (item.getItemId() == R.id.logout) {
                        popup.dismiss();
                        Intent intent = new Intent(getApplicationContext(),SigninView.class);
                        startActivity(intent);
                        finish();
                    }
                    return true;
                }
            });

            popup.show();//showing popup menu
        }
    }
}
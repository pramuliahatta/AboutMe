package com.example.g_eight.aboutme.Activities;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.g_eight.aboutme.Adapters.CustomPagerAdapter;
import com.example.g_eight.aboutme.R;

/**
 * Created by G-Eight on 5/21/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class ViewPagerActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        TextView tvStart = findViewById(R.id.tv_start_now);
        tvStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ViewPagerActivity.this, NavMenuActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}


package com.example.g_eight.aboutme.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.view.Gravity;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.g_eight.aboutme.Fragments.ContactFragment;
import com.example.g_eight.aboutme.Fragments.FriendListFragment;
import com.example.g_eight.aboutme.Fragments.ProfileFragment;
import com.example.g_eight.aboutme.R;

/**
 * Created by G-Eight on 5/18/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class NavMenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_menu);
        loadFragment(new ProfileFragment());
        ImageView menu = findViewById(R.id.img_menu);
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment;
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            fragment = new ProfileFragment();
            drawer.closeDrawer(GravityCompat.START);
            return loadFragment(fragment);
        } else if (id == R.id.nav_contact) {
            fragment = new ContactFragment();
            drawer.closeDrawer(GravityCompat.START);
            return loadFragment(fragment);
        } else if (id == R.id.nav_friend_list) {
            fragment = new FriendListFragment();
            drawer.closeDrawer(GravityCompat.START);
            return loadFragment(fragment);
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
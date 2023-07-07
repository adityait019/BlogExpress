package com.example.blogexpress;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.blogexpress.Fragments.AccountManagerFragment;
import com.example.blogexpress.Fragments.BlogFeedFragment;
import com.example.blogexpress.Fragments.DraftFragment;
import com.example.blogexpress.Fragments.PublishedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView btmView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btmView=findViewById(R.id.btm_home);
        btmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    loadFrag(new BlogFeedFragment(),true);
                } else if (id == R.id.nav_draft) {
                    loadFrag(new DraftFragment(),false);
                } else if (id == R.id.nav_published) {
                    loadFrag(new PublishedFragment(),false);
                } else {
                    loadFrag(new AccountManagerFragment(),false);
                }
                return true;
            }
        });
    }
    public void loadFrag(Fragment fragment, boolean flag)
    {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        if(flag)
        {
            ft.add(R.id.container,fragment);
        }

        else {
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }
}
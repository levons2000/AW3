package com.example.student.bigproject;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.PointerIcon;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<PagerModel> list = new ArrayList<>();
        list.add(new PagerModel("https://pbs.twimg.com/media/DF5aJV_XkAAb9P4.jpg", "Scarlett Johansson"));
        list.add(new PagerModel("http://www.toptens.wiki/wp-content/uploads/2015/10/Olivia-Wilde-1024x768.jpg", "Olivia Wilde"));
        list.add(new PagerModel("http://www.toptens.wiki/wp-content/uploads/2015/10/Angelina-Jolie-1024x576.jpg", "Angelina Jolie"));
        AdapterForPager adapterForPager = new AdapterForPager(list, MainActivity.this);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager.setAdapter(adapterForPager);
        tabLayout.setupWithViewPager(viewPager, true);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_favorite_active_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_favorite_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);
        viewPager.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                tabLayout.getTabAt(viewPager.getCurrentItem()).setIcon(R.drawable.ic_favorite_active_24dp);
                switch (viewPager.getCurrentItem()) {
                    case 0:
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_favorite_black_24dp);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_favorite_black_24dp);
                        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_black_24dp);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(R.drawable.ic_favorite_black_24dp);
                        tabLayout.getTabAt(1).setIcon(R.drawable.ic_favorite_black_24dp);
                        break;

                }

            }
        });

    }
}

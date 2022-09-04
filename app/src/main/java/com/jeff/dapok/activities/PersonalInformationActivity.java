package com.jeff.dapok.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.jeff.dapok.R;
import com.jeff.dapok.adapter.PagerIndicatorAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class PersonalInformationActivity extends AppCompatActivity {

    PagerIndicatorAdapter mAdapter;
    ViewPager mPager;
    ImageView back;
    DotsIndicator indicator;
    int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        indicator = findViewById(R.id.dot);
        back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            back();
        });

        mPager = findViewById(R.id.pager);
        mAdapter = new PagerIndicatorAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);
        mPager.setOffscreenPageLimit(4);
        indicator.setViewPager(mPager);
        setActions();
    }

    private void setActions() {
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                currentPage = position;
                Log.e("CURRENTPAGE" , Integer.toString(currentPage));
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });

    }

    private void back() {
        Log.e("CURRENTPAGE BACK" , Integer.toString(currentPage));
        if (currentPage == 0) {
            Intent intent = new Intent(PersonalInformationActivity.this , LoginSignUpActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
        } else {
            setPage(-1);
        }
    }

    @Override
    public void onBackPressed() {
        back();
    }

    public void setPage(int count) {
        mPager.setCurrentItem(currentPage + count, true);
    }
}
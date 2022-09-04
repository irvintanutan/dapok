package com.jeff.dapok.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;


import com.jeff.dapok.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            hideSystemBars();
            setContentView(R.layout.activity_main);

            delay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void hideSystemBars() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private void delay() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                openapp();//go to activity after 2s
            }
        }, 1000);
    }

    private void openapp() {
        startActivity(new Intent(MainActivity.this, LoginSignUpActivity.class));
        finish();
    }
}
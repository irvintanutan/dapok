package com.jeff.dapok.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jeff.dapok.R;

public class LoginActivity extends AppCompatActivity {

    TextView signUp;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUp = findViewById(R.id.signup);
        login = findViewById(R.id.login);
        signUp.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, PersonalInformationActivity.class);
            startActivity(intent);
            finish();
        });

        login.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this , ProfileActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
        });
    }

    @Override
    public void onBackPressed() { }
}
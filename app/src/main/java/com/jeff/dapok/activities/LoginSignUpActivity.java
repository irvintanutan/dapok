package com.jeff.dapok.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jeff.dapok.R;

public class LoginSignUpActivity extends AppCompatActivity {

    Button login, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        initialize();
    }

    private void initialize(){
        login = findViewById(R.id.login);
        signUp = findViewById(R.id.signup);
        login.setOnClickListener(view -> {
            Intent intent = new Intent(LoginSignUpActivity.this , LoginActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
        });

        signUp.setOnClickListener(view -> {
            Intent intent = new Intent(LoginSignUpActivity.this , PersonalInformationActivity.class);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
        });
    }
    @Override
    public void onBackPressed() { }

}
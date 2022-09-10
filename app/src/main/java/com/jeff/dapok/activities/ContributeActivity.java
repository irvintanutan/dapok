package com.jeff.dapok.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.jeff.dapok.R;

public class ContributeActivity extends AppCompatActivity {


    ImageView back;
    TextView languageText;
    Spinner languageSpinner;
    private AlertDialog finalDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_contribute);
        languageText = findViewById(R.id.localLanguageText);
        languageSpinner = findViewById(R.id.language);
        languageText.setText(intent.getStringExtra("language"));
        back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            back();
        });

        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.languages, android.R.layout.simple_spinner_item);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageSpinner.setAdapter(languageAdapter);
    }


    private void back() {
        Intent intent = new Intent(ContributeActivity.this, ProfileActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);

    }

    public void confirm(View view) {

        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.layout_contribution_alert, null);


        final Button proceed = alertLayout.findViewById(R.id.proceed);

        proceed.setOnClickListener(view1 -> {
            back();
        });

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        // this is set the view from XML inside AlertDialog
        alert.setView(alertLayout);
        // disallow cancel of AlertDialog on click of back button and outside touch
        alert.setCancelable(false);
        finalDialog = alert.create();
        finalDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        finalDialog.show();

    }


    @Override
    public void onBackPressed() {
        back();
    }
}
package com.jeff.dapok.activities.profile;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jeff.dapok.R;

public class BackgroundActivity extends AppCompatActivity {

    @BindView(R.id.education)
    Spinner highestView;
    @BindView(R.id.language)
    Spinner languageView;
    @BindView(R.id.fluent)
    Spinner fluentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        ButterKnife.bind(this);
        loadSpinnerIdTypes();
    }

    private void loadSpinnerIdTypes() {
        ArrayAdapter<CharSequence> educationalAdapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.educationalAttainment, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.languagesYouSpeak, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> fluentAdapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.fluency, android.R.layout.simple_spinner_item);
        educationalAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fluentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        highestView.setAdapter(educationalAdapter);
        languageView.setAdapter(languageAdapter);
        fluentView.setAdapter(fluentAdapter);
    }
}
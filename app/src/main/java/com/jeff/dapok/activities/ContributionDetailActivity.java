package com.jeff.dapok.activities;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.jeff.dapok.R;

public class ContributionDetailActivity extends AppCompatActivity {

    @BindView(R.id.img)
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String status = intent.getStringExtra("status");

        switch (status) {
            case "approved":
                img.setBackground(getResources().getDrawable(R.drawable.approved));
                break;
            case "pending":
                img.setBackground(getResources().getDrawable(R.drawable.pengin));
                break;
            case "reject":
                img.setBackground(getResources().getDrawable(R.drawable.reject));
                break;
        }
    }
}
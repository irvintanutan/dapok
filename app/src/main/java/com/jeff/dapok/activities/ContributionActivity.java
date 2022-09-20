package com.jeff.dapok.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jeff.dapok.R;

public class ContributionActivity extends AppCompatActivity {

    @BindView(R.id.cv1)
    CardView cv1;
    @BindView(R.id.cv2)
    CardView cv2;
    @BindView(R.id.cv3)
    CardView cv3;
    @BindView(R.id.cv4)
    CardView cv4;
    @BindView(R.id.cv5)
    CardView cv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribution);
        ButterKnife.bind(this);

        cv1.setOnClickListener(view -> {
            intent("approved");
        });
        cv2.setOnClickListener(view -> {
            intent("pending");
        });
        cv3.setOnClickListener(view -> {
            intent("reject");
        });
        cv4.setOnClickListener(view -> {
            intent("approved");
        });
        cv5.setOnClickListener(view -> {
            intent("pending");
        });

    }

    void intent(String extra){
        Intent intent = new Intent(ContributionActivity.this, ContributionDetailActivity.class);
        intent.putExtra("status" , extra);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }
}
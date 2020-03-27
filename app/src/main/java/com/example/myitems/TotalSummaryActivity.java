package com.example.myitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TotalSummaryActivity extends AppCompatActivity {


    public Button buttonProceedToCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totalsummary);

        buttonProceedToCheckout = (Button) findViewById(R.id.button7);

        buttonProceedToCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TotalSummaryActivity.this, CheckoutActivity.class));
            }
        });

    }



}

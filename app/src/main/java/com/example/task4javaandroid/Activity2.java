package com.example.task4javaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView sumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Initialize UI elements
        sumTextView = findViewById(R.id.sumTextView);

        // Get sum value from Intent
        int sum = getIntent().getIntExtra("sum", 0);

        // Set sum value in TextView
        sumTextView.setText("Sum = " + sum);
    }
}

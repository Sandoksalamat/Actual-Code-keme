package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BahayKubo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahay_kubo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sampaguita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sampaguita);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Bakya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakya);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
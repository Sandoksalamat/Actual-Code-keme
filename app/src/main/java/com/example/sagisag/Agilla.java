package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Agilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agilla);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
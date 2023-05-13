package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sampaguita extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sampaguita);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button boton = findViewById(R.id.button3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Sampaguita.this,Narra.class);
                startActivity(next);
            }
        });
    }
}
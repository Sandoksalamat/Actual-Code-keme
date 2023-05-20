package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carinosa extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carinosa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button prev = findViewById(R.id.lbutton11);
        tv =  (TextView) findViewById(R.id.content_carinosa);
        String xd = "";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Carinosa.this,Perlas.class);
                startActivity(prv);
            }
        });
    }
}
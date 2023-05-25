package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Narra extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narra);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button leftboton = findViewById(R.id.lbutton);
        Button rightboton = findViewById(R.id.rbutton);
        tv = (TextView) findViewById(R.id.content_narra);
        String xd = "Meaning: \n Known as the National Tree of the Philippines, Narra is a majestic reddish hardwood tree reflecting the same resiliency and strength as that of the Filipino people. \n" +
                "\n History and Backround: \n On June 21, 1969, the Municipality of Narra was created by virtue of Republic Act No. 5642 signed by President Ferdinand Marcos. Having a title as 'The Rice Granary of Palawan' Municipality of Narra is the main rice producer of the Province of Palawan. \n" +
                "\n Other info: \n Narra is a graceful tree with drooping branches that toss in the trade winds. Short-lived flowers usually appear in April or May, and for a day or two the tree is a shimmering mass of fragrant yellow blooms, which then fall off nearly all at once. \n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());
        leftboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Narra.this,Sampaguita.class);
                startActivity(next);
            }
        });

        rightboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Narra.this, Arnis.class);
                startActivity(next);
            }
        });
    }
}
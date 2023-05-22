package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Mangga extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangga);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton4);
        Button prev = findViewById(R.id.lbutton4);
        tv = (TextView) findViewById(R.id.content_mangga);
        String xd = "Meaning: \n signifies richness and a heart shape that symbolizes a very important part like in human anatomy. \n" +
                "\n History and Background: \n Mangoes remain one of the most cultivated tropical fruits in the world. As the national fruit of India it represents prosperity, abundance and richness in favor of the country’s image. Mango is one of the most widely grown fruits of the tropical countries. \n" +
                "\n Other Info: \n Did you know that Philippines holds the record for the “World’s Biggest Mango” which weighs 3.5 kilos (7.7 lbs.)? And the best and the sweetest mango producer in the Philippines are in Zambales and Guimaras.\n" +
                "\n The mango fruit belongs to the genus Mangifera and the family Anacardiaceae – it is closely related to the cashew!";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Mangga.this,Agilla.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Mangga.this,Carabao.class);
                startActivity(prv);
            }
        });
    }
}
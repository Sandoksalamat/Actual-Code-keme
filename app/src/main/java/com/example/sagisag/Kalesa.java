package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kalesa extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalesa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton9);
        Button prev = findViewById(R.id.lbutton9);
        tv = (TextView) findViewById(R.id.content_kalesa);
        String xd = "Meaning: \n a symbol of nobility and prestige \n" +
                "\n History and Background: \n Philippine kalesa is a horse-driven carriage that looks like an inclined cart, was introduced during the 18th century. The kalesa has two round wheels on each side and two rows of seats that can accommodate four persons. The driver sits on a block of wood located at the front of the cart near the horse. This was one of the methods of transportation introduced in the Philippines in the 18th century by the Spaniards that only nobles and high ranked Spanish officials could afford. The Ilustrados, who are the rich Filipinos who had their own businesses, used the kalesa not only for traveling but as a way of transporting their goods as well. They are hardly ever used in the streets nowadays except in tourist spots and some rural areas. It has been around since the Spanish times in the Philippines, providing taxi service from one end of town to another, and from one town to another. The horse that pulled the kalesa went through several stages of training under its kuchero or driver. \n" +
                "\n Other Info: \n Other vehicles, from the pedicab to the Mercedes have come and gone, but the kalesa has survived their competition. Town fiestas would not be complete without the parade of kalesas in full regalia. Today, with tourism on the rise, visitors enjoy cruising through town in these horse-drawn carriages.  Today when you hear the rhythmic clip-clop of a horse and the resonant ding-dong of a bell, you can be sure a kalesa is coming. Long live the Kalesa! \n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Kalesa.this,Perlas.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Kalesa.this,Bakya.class);
                startActivity(prv);
            }
        });
    }
}
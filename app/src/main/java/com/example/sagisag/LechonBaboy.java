package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class LechonBaboy extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lechon_baboy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton3);
        Button prev = findViewById(R.id.lbutton3);
        tv = (TextView) findViewById(R.id.content_lechon);
        String xd = "Meaning: \n symbolizes the bond between communities when it comes to fiestas and also symbolizes the joyfulness of gatherings. \n" +
                "\n History and Background: \n Before the Spaniards set foot in Asian countries, roasted pork had long existed in Austronesian cultures (which includes peoples in Taiwan, Southeast Asia, Oceania, and Madagascar). Pigs originated in China where traders introduced the species all throughout Southeast Asia and Oceania and even taught the populations about cooking pork and roasting pig. While roasting pigs already existed in the Philippines before the Spanish arrived, it was the Spaniards who labeled the process of roasting a whole pig, lechon. \n" +
                "\n Other Info: \n In fact, lechon, lechon asado, and lechona are names for roasted pork in countries like Cuba, Puerto Rico, the Dominican Republic, and Colombia. Historically during the Spanish Inquisition years, the Spanish tested Muslims and Jews who were converting to Christianity by having them eat pork. In the Philippines, they saw the many religions of the country, so they promoted pork in order to spread their culture and religion. Lechon is certainly one of the Philippines’ national dishes that is commonly served during feasts, fiestas, holidays, celebrations, and gatherings for family and friends.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(LechonBaboy.this,Carabao.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(LechonBaboy.this,Narra.class);
                startActivity(prv);
            }
        });
    }
}
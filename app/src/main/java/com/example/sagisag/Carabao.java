package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Carabao extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carabao);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton3);
        Button prev = findViewById(R.id.lbutton3);
        tv = findViewById(R.id.content_carabao);
        String xd = "Meaning: \n power, efficiency, perseverance, and hard work \n \n History and Background: \n The carabao or kalabaw is a water buffalo that is endemic in Southeast Asia. Aside from helping our farmers plow the fields, this animal is our source of transportation, milk for sweets and cooking, meat, raw materials to design furniture, coin and mascot designs, body armor, children’s songs, jokes, and expressions in the vernacular. Moreover, The carabao is an important part of the Philippine economy and a fixture in Filipino culture. The economic power of the carabao to draw objects contributes 1.48 million dollars to the Philippine economy. This is due to the significance of the Carabao in agriculture, among other things. Because they are strong enough to plow rice fields as well as other crop fields, a benefit that weighing half a ton allows them is that they may be found pulling timber and other goods on carts called kariton (cart) and kareta (sled). ";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Carabao.this,Mangga.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Carabao.this,LechonBaboy.class);
                startActivity(prv);
            }
        });
    }
}
package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anahaw extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anahaw);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton6);
        Button prev = findViewById(R.id.lbutton6);
        tv = (TextView) findViewById(R.id.content_anahaw);
        String xd = "Meaning: \n It represent high achievement, strength, and loyalty. \n" +
                "\n History and Background: \n Our ancestors has been using the Anahaw as part of our shelters as the roof and sometimes the walls. The leaf has been used as pambalot (food wrapper) for tikoy, or as a makeshift lunchbox for children going to school since lunchboxes were very expensive before. It has been made into Abaniko (fan), which is very beautiful and a work of art. A relief on a crowded place, or simply a refreshment from a hot, humid day, the colorful abaniko is an indispensable item in a Pinoy's everyday life. Its really not about the object itself. That's why its called symbol. Its what the object symbolizes. And for the leaf, it symbolizes our ingenuity and resourcefulness. \n" +
                "\n Other Info: \n The palm tree’s scientific name is Saribus rotundifolius (formerly Livistona rotundifolia). It’s called the round-leaf fountain palm or footstool palm in English and serdang in other Southeast Asian countries. Anahaw starts to flower from March to July. The palm stars to bear fruits at age 10 attaining a 20-cm diameter at breast height an a 5-8 m height. Mature fruits are ready for collection from August to September.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Anahaw.this,BahayKubo.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Anahaw.this,Agilla.class);
                startActivity(prv);
            }
        });
    }
}
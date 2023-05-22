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
        String xd = "Meaning: \n Cariñosa is a word that describes an affectionate, friendly and lovable woman. This dance is performed in flirtatious manner with fans and handkerchiefs to assist the dancers' hide- and-seek movements. \n" +
                "\n History and Background: \n The cariñosa originated in Panay Island and was introduced by the Spaniards during their colonization of the Philippines. The cariñosa originated in Panay Island and was introduced by the Spaniards during their colonization of the Philippines. It is related to some of the Spanish dances like the bolero and the Mexican dance jarabe tapatio or the Mexican hat dance. \n" +
                "\n Other Info: \n is a Philippine dance of colonial-era origin from the Maria Clara suite of Philippine folk dances, where the fan or handkerchief plays an instrumental role as it places the couple in a romance scenario.\n";
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
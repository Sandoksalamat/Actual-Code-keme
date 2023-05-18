package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sampaguita extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sampaguita);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button boton = findViewById(R.id.button3);
        textview = (TextView) findViewById(R.id.content_Sampag);
        String xd = "it_is_declared_as_the_national_flower_by_governor_general_frank_murphy_in_1934_in_the_philippines_it_is_unusual_for_someone_to_give_sampaguita_to_another_person_as_a_gift_or_as_a_sign_of_adoration_because_it_has_a_lasting_impression_of_being_solely_offered_to_saints";
        textview.setText(xd);
        textview.setMovementMethod(new ScrollingMovementMethod());

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Sampaguita.this,Narra.class);
                startActivity(next);
            }
        });
    }
}
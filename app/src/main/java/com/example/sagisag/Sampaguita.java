package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.GestureDetector;
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
        String xd = "it_was_declared_as_the_national_flower_by_governor_general_frank_murphy_in_1934_in_the_philippines_it_is_unusual_for_someone_to_give_sampaguita_to_another_person_as_a_gift_or_as_a_sign_of_adoration_because_it_has_a_lasting_impression_of_being_solely_offered_to_saints_plus_did_you_know_that_sampaguita_is_not_native_to_the_philippines_and_is_still_not_considered_a_naturalized_species_it_has_a_pantropical_distribution_and_is_commonly_cultivated_in_the_country_for_ornamental_purposes_the_sweet_smelling_flowers_are_often_made_into_garlands_and_perfumery_there_are_more_than_10_species_of_jasminum_in_the_philippines_and_8_species_are_considered_endemic_and_are_not_found_elsewhere_in_the_world";
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
package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Narra extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narra);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tv = (TextView) findViewById(R.id.content_narra);
        String xd = "known_as_the_national_tree_of_the_philippines_narra_is_a_majestic_reddish_hardwood_tree_reflecting_the_same_resiliency_and_strength_as_that_of_the_filipino_people_historically_on_june_21_1969_the_municipality_of_narra_was_created_by_virtue_of_republic_act_no_5642_signed_by_president_ferdinand_marcos_having_a_title_as_quot_the_rice_granary_of_palawan_quot_municipality_of_narra_is_the_main_rice_producer_of_the_province_of_palawan_additionally_narra_is_a_graceful_tree_with_drooping_branches_that_toss_in_the_trade_winds_short_lived_flowers_usually_appear_in_april_or_may_and_for_a_day_or_two_the_tree_is_a_shimmering_mass_of_fragrant_yellow_blooms_which_then_fall_off_nearly_all_at_once";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
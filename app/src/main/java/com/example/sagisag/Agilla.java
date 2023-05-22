package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Agilla extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agilla);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton5);
        Button prev = findViewById(R.id.lbutton5);
        tv = (TextView) findViewById(R.id.content_agila);
        String xd = "Meaning: \n a nation's unity, its hopes, achievements, glory and successes.\n" +
                "\n History and Background: \n The Philippine Eagle is one of the rarest birds in the world, with an estimated population of fewer than than 500 individuals. The Philippine Eagle was the official mascot for the Southeast Asian Games competition in 2005. \n" +
                "\n Other Info: \n Currently, this eagle belongs to the most endangered 'species' in the whole world. Catching or hunting, and destroying its habitat such as logging and burning the forest to make farmland is the reason for the rapid depletion of this national bird. To protect the population, the Convention on International Trade of Endangered Species of Wild Fauna and Flora (CITES) prohibits its capture and sale. In addition, a 'captive-breeding program' was established under the management of the Philippine Eagle Foundation. This program through artificial insemination has brought to life 10 'eaglets' since 1991.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Agilla.this,Anahaw.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Agilla.this,Mangga.class);
                startActivity(prv);
            }
        });
    }
}
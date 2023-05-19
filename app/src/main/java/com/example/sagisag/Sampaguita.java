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
        String xd = "Meaning:\n symbolize purity, fidelity, and hope \n " +
                "\n History and Background: \n It was declared as the national flower by Governor-General Frank Murphy in 1934. In the Philippines, it is unusual for someone to give Sampaguita to another person as a gift or as a sign of adoration because it has a lasting impression of being solely offered to saints.\n " +
                "\n Other Info:\n Did you know that Sampaguita is not native to the Philippines and is still not considered a naturalized species? It has a pantropical distribution and is commonly cultivated in the country for ornamental purposes. The sweet-smelling flowers are often made into garlands and perfumery. There are more than 10 species of Jasminum in the Philippines and 8 species are considered endemic and are not found elsewhere in the world. \n";
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
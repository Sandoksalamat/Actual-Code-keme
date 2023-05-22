package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perlas extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perlas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton10);
        Button prev = findViewById(R.id.lbutton10);
        tv = (TextView) findViewById(R.id.content_perlas);
        String xd = "Meaning: \n a symbol of wisdom, luck, purity, and love.\n" +
                "\n History and Background: \n Leoniza and her fisherman boyfriend are truly in love. They cursed their marriage when they reached the age of twenty one. They are loyal to each other and never fight, so their love and longing for each other only deepens. The fisherman kept saying 'I love you' and Leoniza kept saying 'take care of your work'. Their life continued until the lover was never seen again. Leoniza lost all her appetite. He always looked at the sea while crying non-stop. Sometimes laughing, sometimes just looking. Because of this, the unexpected happened: Leoniza became a stone person. Once upon a time there was a mother and daughter who were visited by a stone man. It made Leoniza cry and her tears turned into a pearl. The stone man was washed away by the waves so that his pearls were scattered all over Mindanao. Pearls evoke elegance and distinction. They are a source of incomparable joy. In the Philippines, the Golden South Sea Pearl is a national gem. This highly prized wonder of nature from our tropical shores symbolizes the embodiment of the country's tradition and culture. \\n\n" +
                "\n Other Info: \n Pearls evoke elegance and distinction. They are a source of incomparable joy. In the Philippines, the Golden South Sea Pearl is a national gem. This highly prized wonder of nature from our tropical shores symbolizes the embodiment of the country's tradition and culture. \n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Perlas.this,Carinosa.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Perlas.this,Kalesa.class);
                startActivity(prv);
            }
        });
    }
}
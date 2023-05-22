package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BahayKubo extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahay_kubo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton7);
        Button prev = findViewById(R.id.lbutton7);
        tv = (TextView) findViewById(R.id.content_bk);
        String xd = "Meaning: \n is a symbol of the unity of the people in a community by means of 'Bayanihan'. \n" +
                "\n History and Background: \n The history of the bahay kubo is split roughly in two eras; the Classical period (Pre-hispanic Era) and the Hispanic Era. The classical period Bahay Kubos were made simply to adapt to the climate of the Philippines. It was meant to be light and cover as much ground for shade and air-flow. And the materials were made sustainable and easy to repair such as plant materials like straws, thatch, and bamboo. During the Hispanic Era, Bahay Kubos made under Spanish rule were constructed in a similar fashion to how communities were constructed around rivers and streams with a more urban plan set around public places such as churches. They also made with Spanish architecture and design in mind. \n" +
                "\n Other Info: \n Bahay Kubos also exemplifies the Filipino virtue of bayanihan, which refers to a sense of communal solidarity or effort to attain a goal. The genesis of which stems from a widespread practice in Philippine villages in which community people volunteer to help a family relocate by transporting the house to a designated site. It entails physically transporting the home to its new site. This is accomplished by constructing a sturdy structure of bamboo poles to lift the stilts from the ground and hoist the entire home with the men positioned at the ends of each pole. The custom typically includes a little fiesta held by the family to thank the volunteers.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(BahayKubo.this,Bakya.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(BahayKubo.this,Anahaw.class);
                startActivity(prv);
            }
        });
    }
}
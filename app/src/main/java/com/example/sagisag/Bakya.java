package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bakya extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakya);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton8);
        Button prev = findViewById(R.id.lbutton8);
        tv = (TextView) findViewById(R.id.content_bakya);
        String xd = "Meaning: \n 'low-class', 'unsophisticated' or 'cheap' \n" +
                "\n History and Background: \n Clogs were a common footwear of the Filipinos in the olden days, which became more popular during the time of the Americans. It is made of wood that is customized according to the size and shape of the wearer. It is suitable for use especially if it is necessary to walk on muddy or wet roads due to its durability and design that is raised from the ground. Amid its popularity, it was considered a symbol of the masses; but with the passage of time the word bakya has had a different meaning that may refer to being 'baduy' or lacking in quality. However, the clog still represents the Filipino culture, of being creative and resilient no matter what is faced. \n" +
                "\n Other Info: \n It is carved with a slight relief or curve on both sides to give a foot-like shape. The wood used to make clogs is thick, which is why it is usually carved with some designs, such as flowers and mountains. It is polished to make it smooth, and sometimes painted to give it a more pleasing appearance. Clogs are usually more than an inch high, and some have an extra heel to lift them off the ground.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Bakya.this,Kalesa.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Bakya.this,BahayKubo.class);
                startActivity(prv);
            }
        });
    }
}
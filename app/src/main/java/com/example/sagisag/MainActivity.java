package com.example.sagisag;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView white_flower = (ImageView) findViewById(R.id.Sampaguita);
        ImageView tree = (ImageView) findViewById(R.id.Narra);
        ImageView roasted_pork = (ImageView) findViewById(R.id.LechonBaboy);
        ImageView kalabaw = (ImageView) findViewById(R.id.Carabao);
        ImageView fruit = (ImageView) findViewById(R.id.Mangga);
        ImageView bird = (ImageView) findViewById(R.id.Agila);
        ImageView herb = (ImageView) findViewById(R.id.Anahaw);
        ImageView home = (ImageView) findViewById(R.id.BahayKubo);
        ImageView shoe_wear = (ImageView) findViewById(R.id.Bakya);
        ImageView transpo = (ImageView) findViewById(R.id.Kalesa);
        ImageView pearl = (ImageView) findViewById(R.id.Perlas);
        ImageView dance = (ImageView) findViewById(R.id.Carinosa);

    white_flower.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent flower = new Intent(MainActivity.this,Sampaguita.class);
            startActivity(flower);
        }
    });

    tree.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent puno = new Intent(MainActivity.this,Narra.class);
            startActivity(puno);
        }
    });

    roasted_pork.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent roasted = new Intent(MainActivity.this,LechonBaboy.class);
            startActivity(roasted);
        }
    });

    kalabaw.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent cow = new Intent(MainActivity.this,Carabao.class);
            startActivity(cow);
        }
    });

    fruit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mango = new Intent(MainActivity.this,Mangga.class);
            startActivity(mango);
        }
    });

    bird.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent birb = new Intent(MainActivity.this,Agilla.class);
            startActivity(birb);
        }
    });

    herb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent plant = new Intent(MainActivity.this,Anahaw.class);
            startActivity(plant);
        }
    });

    home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent homie = new Intent(MainActivity.this,BahayKubo.class);
            startActivity(homie);
        }
    });

    shoe_wear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent sandal = new Intent(MainActivity.this,Bakya.class);
            startActivity(sandal);
        }
    });

    transpo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent vroom = new Intent(MainActivity.this, Kalesa.class);
            startActivity(vroom);
        }
    });

    pearl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent jewel = new Intent(MainActivity.this, Perlas.class);
            startActivity(jewel);
        }
    });

    dance.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent dancing = new Intent(MainActivity.this, Carinosa.class);
            startActivity(dancing);
        }
    });

    getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if (item_id == R.id.aboutus) {
            Intent please = new Intent(MainActivity.this,about.class);
            startActivity(please);
        }
        return true;
    }
}
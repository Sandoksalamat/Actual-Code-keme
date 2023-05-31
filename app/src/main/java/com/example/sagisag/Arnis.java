package com.example.sagisag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Arnis extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arnis);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button next = findViewById(R.id.rbutton3);
        Button prev = findViewById(R.id.lbutton3);
        tv = (TextView) findViewById(R.id.content_lechon);
        String xd = "Meaning: \n Filipino 'arnisadors' are fiercely proud of their country, and the sport that symbolises their spirit of battle and revolution. \n" +
                "\n History and Background: \n Arnis, as a martial art, was spawned in Philippine soil. It was known in ancient Philippines as kali, an ancient Malayan word that implies a large bladed weapon longer than a knife. This art was practiced primarily for self-defense by the pre-Spanish Filipinos who were noted for their friendly nature and legendary hospitality.\n" +
                "The art of hand-to-hand combat has always been an integral part of the Filipino in his long, turbulent, and bloody history. By force of necessity and self-preservation he became an expert in fighting with his hands, either bare or with a stick and a bladed weapon. Even before the introduction of the bladed weapon, the early Filipinos were already a fighting people using the bow and arrow or the longbow. The primitive Negritos, coming from Central Asia during prehistoric times, were experts in these weapons. As a fighting art, Arnis has three forms of play. They are the espada y daga ('sword and dagger') in which a long wooden sword and a short wooden dagger is used; the solo baston (single stick) in a single long muton or baston (wooden stick or rattan cane hardened by drying or heating) is used; and the sinawali, a native term applied because the intricate movements of the two muton resemble the weave of a sawali (criss-cross fashion), the bamboo splits weave pattern used in walling and matting.\n" +
                "The lives of Filipino heroes are linked with the awesome power of the martial art of Arnis. They triumphantly waged their heroic battles for freedom and liberty as a testimony of the power and effectiveness of Arnis. Their successful stand against their superiorly armed adversaries in mortal combat in the arena of battle is now held in immortal inviolability by history of the 16th century. Kali (Arnis) became so popular during the early days that it was known as the sport of kings and of the members of the royal blood. The first and foremost experts of the art were the rajah and maharlika of the Visayas and Tagalog regions, Amandakwa in Pangasinan, and Baruwang of the Cagayan Valley region \n" +
                "\n Other Info: \n Arnis de mano is the best known and the most systematic fighting art in the Philippines. It is a perfected art after a long historical development from the kali systems designed to train the student to defend himself against armed or unarmed attacks. Arnis, as it is commonly called, has also been known in other dialects as estacada among the Tagalog provinces and estoque or fragile in other regions.\n";
        tv.setText(xd);
        tv.setMovementMethod(new ScrollingMovementMethod());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nxt = new Intent(Arnis.this,Carabao.class);
                startActivity(nxt);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prv = new Intent(Arnis.this,Narra.class);
                startActivity(prv);
            }
        });
    }
}
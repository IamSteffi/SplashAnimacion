package com.example.splashanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton abeja, ajolote, bunny, camaleon, koala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abeja = findViewById(R.id.abeja);
        ajolote = findViewById(R.id.ajolote);
        bunny = findViewById(R.id.bunny);
        camaleon = findViewById(R.id.camaleon);
        koala = findViewById(R.id.koala);

        abeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Es una abeja", Toast.LENGTH_LONG).show();
            }
        });
        ajolote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Es un ajolote", Toast.LENGTH_LONG).show();
            }
        });
        bunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Es un conejo", Toast.LENGTH_LONG).show();
            }
        });
        camaleon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Es un camaleon", Toast.LENGTH_LONG).show();
            }
        });
        koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Es un koala", Toast.LENGTH_LONG).show();
            }
        });
    }
}
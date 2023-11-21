package com.example.tugassplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button hello;
    Button Count;
    Button Sianida;
    Button TwoActivity;
    Button SetAlarm;
    Button Repository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = findViewById(R.id.btnhello);
        Count = findViewById(R.id.btncount);
        Sianida = findViewById(R.id.btnsianida);
        TwoActivity = findViewById(R.id.btnTwoActivity);
        SetAlarm = findViewById(R.id.btnSetalarm);
        Repository = findViewById(R.id.btnRepository);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this,helloactivity.class);
                startActivity(Buka);
            }
        });
        Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this,countactivity.class);
                startActivity(Buka);
            }
        });
        Sianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this, sianidaActivity.class);
                startActivity(Buka);
            }
        });
        TwoActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this, Twoactivity.class);
                startActivity(Buka);
            }
        });
        SetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this, Setalarm.class);
                startActivity(Buka);
            }
        });
        Repository.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Buka = new Intent(MainActivity.this, Repository.class);
                startActivity(Buka);
            }
        });

    }
}

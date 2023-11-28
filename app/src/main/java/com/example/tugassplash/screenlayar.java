package com.example.tugassplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

public class screenlayar extends AppCompatActivity {

    ImageView img, logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenlayar);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logo = findViewById(R.id.logo);
        img = findViewById(R.id.img);

        logo.animate().translationX(-4000).setDuration(1000).setStartDelay(2300);
        img.animate().translationX(-4000).setDuration(1000).setStartDelay(2300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(screenlayar.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        }, 5000);

    }
}
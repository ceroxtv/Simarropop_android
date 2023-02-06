package com.example.simarropop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.simarropop.R;

public class AnimationActivity extends AppCompatActivity {
    TextView txt;
    LottieAnimationView anime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        txt = findViewById(R.id.tvAnimation);
        anime = findViewById(R.id.animacion);

        txt.animate().translationX(2000).setDuration(1000).setStartDelay(800);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);


            }
        },2000);
    }
}
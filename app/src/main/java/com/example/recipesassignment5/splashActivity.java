package com.example.recipesassignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class splashActivity extends AppCompatActivity {
    MediaPlayer splashPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPlayer = new MediaPlayer();
        splashPlayer = MediaPlayer.create(this, R.raw.ukulele);
        splashPlayer.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splashActivity.this, RecipeListActivity.class));
                splashPlayer.stop();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}
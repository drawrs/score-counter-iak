package com.khilman.www.haripertamaiak;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set tampilan utama activity
        setContentView(R.layout.activity_splash);
        // Panggil class Handler
        Handler handler = new Handler();
        // Buat delayed event
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Aksi yang akan dilakukan
                // Mulai activity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                // akhiri activity
                finish();

            }
        }, 3000);

    }
}

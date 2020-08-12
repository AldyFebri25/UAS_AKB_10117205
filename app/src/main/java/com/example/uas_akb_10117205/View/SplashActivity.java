package com.example.uas_akb_10117205.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uas_akb_10117205.R;

public class SplashActivity extends AppCompatActivity {
    /*NIM:10117205
     Nama:Aldy Febriansyah
     Kelas:IF7*/
    private final int SPLASH_DISPLAY_LENGTH = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawableResource(R.drawable.splash_bg);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);

    }
}

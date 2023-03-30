package com.example.drivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AfterStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_start);
    }
    public void freeMode(View v){
        startActivity(new Intent(AfterStart.this, freemode.class));
    }
    public void TimerMode(View v){
        startActivity(new Intent(AfterStart.this, timermode.class));
    }
}




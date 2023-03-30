package com.example.drivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class timermode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timermode);
    }
    public void BackHome(View v){
        startActivity(new Intent(timermode.this, AfterStart.class));
    }
}
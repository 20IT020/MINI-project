package com.example.drivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class freemode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freemode);
    }
    public void BackHome(View v){
        startActivity(new Intent(freemode.this, AfterStart.class));
    }
    public void Start15Que(View v){
        startActivity(new Intent(freemode.this, Que15FreeMode.class));
    }
}
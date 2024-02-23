package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class c1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);
    }

    public void c1f1(View v){
        Intent intent = new Intent(this, c1f1.class);
        startActivity(intent);
    }

    public void c1f2(View v){
        Intent intent = new Intent(this, c1f2.class);
        startActivity(intent);
    }

    public void c1f3(View v){
        Intent intent = new Intent(this, c1f3.class);
        startActivity(intent);
    }
}
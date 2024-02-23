package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class c2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
    }

    public void c2f1(View v){
        Intent intent = new Intent(this, c2f1.class);
        startActivity(intent);
    }

    public void c2f2(View v){
        Intent intent = new Intent(this, c2f2.class);
        startActivity(intent);
    }

    public void c2f3(View v){
        Intent intent = new Intent(this, c2f3.class);
        startActivity(intent);
    }
}
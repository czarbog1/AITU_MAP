package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class c3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3);
    }

    public void c3f1(View v){
        Intent intent = new Intent(this, c3f1.class);
        startActivity(intent);
    }

    public void c3f2(View v){
        Intent intent = new Intent(this, c3f2.class);
        startActivity(intent);
    }

    public void c3f3(View v){
        Intent intent = new Intent(this, c3f3.class);
        startActivity(intent);
    }
}
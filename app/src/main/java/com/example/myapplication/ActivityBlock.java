package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityBlock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
    public void click(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void click3(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void c1(View v){
        Intent intent = new Intent(this, c1.class);
        startActivity(intent);
    }

    public void c2(View v){
        Intent intent = new Intent(this, c2.class);
        startActivity(intent);
    }

    public void c3(View v){
        Intent intent = new Intent(this, c3.class);
        startActivity(intent);
    }
}
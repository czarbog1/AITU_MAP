package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void main1(View v){
        Intent intent = new Intent(this, ActivityBlock.class);
        startActivity(intent);
    }
    public void main3(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void carta4(View v){
        Intent intent = new Intent(this, work1.class);
        startActivity(intent);
    }
    public void carta5(View v){
        Intent intent = new Intent(this, Map2.class);
        startActivity(intent);
    }
    public void carta6(View v){
        Intent intent = new Intent(this, Map3.class);
        startActivity(intent);
    }
}
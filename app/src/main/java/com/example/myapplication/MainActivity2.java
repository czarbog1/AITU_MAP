package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void showDialog(View v) {
        CustomDialogFragment dialog = new CustomDialogFragment();
        dialog.show(getSupportFragmentManager(), "custom");
    }
    public void activity(View v){
        Intent intent = new Intent(this, ActivityBlock.class);
        startActivity(intent);
    }
    public void ads(View v){
        Intent intent = new Intent(this, ads.class);
        startActivity(intent);
    }
    public void activity3(View v){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void abtd(View v){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void no(View v){
        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);
    }
}
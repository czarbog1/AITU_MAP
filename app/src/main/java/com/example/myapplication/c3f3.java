package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class c3f3 extends AppCompatActivity {

    private ImageView img;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3f3);
        office();
    }
    public void office() {
        img = (ImageView) findViewById(R.id.imageView10);
        btn = (Button)findViewById(R.id.button15);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        img.setVisibility(View.VISIBLE);
                    }
                }
        );
    }
}
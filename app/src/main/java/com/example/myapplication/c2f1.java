package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class c2f1 extends AppCompatActivity {

    RadioGroup rg;
    Button btn;
    private ImageView img1;
    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2f1);
        rg = findViewById(R.id.rg);
        btn = findViewById(R.id.button15);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkedId = rg.getCheckedRadioButtonId();
                if (checkedId == -1){
                    Message.message(getApplicationContext(), "PLease select a path");
                }
                else {
                    findRadioButton(checkedId);
                }
            }
        });
    }

    private void findRadioButton(int checkedId) {
        img1 = (ImageView)findViewById(R.id.imageView5);
        img2 = (ImageView)findViewById(R.id.imageView6);
        switch (checkedId){
            case R.id.radioButton3:
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
                break;
        }
        switch (checkedId){
            case R.id.radioButton4:
                img2.setVisibility(View.VISIBLE);
                img1.setVisibility(View.INVISIBLE);
                break;
        }
    }

}
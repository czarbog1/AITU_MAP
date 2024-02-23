package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class Map2 extends AppCompatActivity {

    private ImageView IV;
    private float Factor = 1.0f;
    ScaleGestureDetector SGD_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);

        IV = findViewById(R.id.imageView138);
        SGD_1 = new ScaleGestureDetector(this,new ScaleListener());
    }

    @Override

    public boolean onTouchEvent(MotionEvent mEvent){
        return SGD_1.onTouchEvent(mEvent);
    }
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override

        public boolean onScale(ScaleGestureDetector SGD_2){
            Factor *= SGD_2.getScaleFactor();
            IV.setScaleX(Factor);
            IV.setScaleY(Factor);

            Factor = Math.max(2.0f, Math.min(Factor, 1.5f));

            return true;
        }
    }
}
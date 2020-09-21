package com.example.mytabanimation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_zoom,btn_fade,btn_clockwise,btn_slide,btn_move,btn_blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_zoom = (Button)findViewById(R.id.button_zoom);
        btn_fade = (Button)findViewById(R.id.button_fade);
        btn_clockwise = (Button)findViewById(R.id.button_clockwise);
        btn_slide = (Button)findViewById(R.id.button_slide);
        btn_move = (Button)findViewById(R.id.button_move);
        btn_blink = (Button)findViewById(R.id.button_blink);

        btn_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.zoom);
                image.startAnimation(animation);
            }
        });

        btn_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
                image.startAnimation(animation1);
            }
        });

        btn_clockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
                image.startAnimation(animation1);
            }
        });

        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
                image.startAnimation(animation1);
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                image.startAnimation(animation1);
            }
        });

        btn_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)findViewById(R.id.imageView);
                Animation animation1 =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                image.startAnimation(animation1);
            }
        });
    }
}
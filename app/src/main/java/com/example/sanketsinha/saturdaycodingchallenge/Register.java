package com.example.sanketsinha.saturdaycodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private Button register;
    private ImageView img;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = (Button) findViewById(R.id.registerBtn);
        img = (ImageView) findViewById(R.id.logo1);

        animation=AnimationUtils.loadAnimation(Register.this, R.anim.logoanim);
        img.startAnimation(animation);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this,"Registered", Toast.LENGTH_LONG).show();
            }
        });
    }
}

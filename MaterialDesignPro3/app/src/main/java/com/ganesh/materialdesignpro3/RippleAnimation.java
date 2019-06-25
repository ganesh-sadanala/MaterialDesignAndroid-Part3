package com.ganesh.materialdesignpro3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class RippleAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_animation);

    }

    public void dummyClick(View view) {
        //Without click event ripples are not enabled
    }
}

package com.ganesh.materialdesignpro3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    AppCompatImageView tv,bb;
    AppCompatTextView  title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tvimage);
        bb=findViewById(R.id.bbimage);
        title=findViewById(R.id.title);

    }

    public void checkRippleAnimation(View view) {
        Intent intent = new Intent(this,RippleAnimation.class);
        startActivity(intent);
    }

    public void sharedElementTransition(View view) {
        Pair  pair[]=new Pair[3];
        pair[0]=new Pair<View,String>(tv,"tv_shared");
        pair[1]=new Pair<View,String>(bb,"bb_shared");
        pair[2]=new Pair<View,String>(title,"title_shared");
        ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this,pair);
        Intent intent=new Intent(this,SharedElementActivity.class);
        startActivity(intent,optionsCompat.toBundle());
    }
}

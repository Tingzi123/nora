package com.example.ausu.myapplication.animation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;

import  com.example.ausu.myapplication.R;
import com.example.ausu.myapplication.loginWeb.loginActivity;


public class animationActivity extends AppCompatActivity implements Animation.AnimationListener {
    private int intCounter = 0;
    private Handler myhandler = new Handler();
    private AlphaAnimation alph;
    private View img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animation);
        img = findViewById(R.id.img);
        alph = new AlphaAnimation(1,0);
        alph.setDuration(500);
        alph.setFillAfter(true);
        img.setAnimation(alph);
        //new,入口
        //startActivity(new Intent(animationActivity.this,loginActivity.class));
        alph.setAnimationListener(animationActivity.this);
    }

    @Override
    public void onAnimationStart(Animation animation) {


    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(animationActivity.this,loginActivity.class);
        startActivity(intent);

        //startActivity(new Intent(animationActivity.this,loginActivity.class));
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        Intent intent = new Intent(animationActivity.this,loginActivity.class);
        startActivity(intent);
    }

    /*public Runnable fadeInTask = new Runnable() {
        @Override
        public void run() {
                intCounter = intCounter+1;
                img.setAlpha(intCounter*15);
                if(intCounter==17) myhandler.postDelayed(fadeOutTask,300);
                else myhandler.postDelayed(fadeInTask,300);
            }
        };

    private Runnable fadeOutTask = new Runnable() {
        @Override
        public void run() {
            intCounter = intCounter+1;
            img.setAlpha(intCounter*15);
            if(intCounter==17) myhandler.postDelayed(fadeInTask,200);
            else myhandler.postDelayed(fadeOutTask,200);
        }
    };*/

}

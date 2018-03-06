package com.example.jose.prueba_t2_interfaces;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener{

    TextView tv_splash_fox;
    ImageView iv_splash_fox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        tv_splash_fox = (TextView)findViewById(R.id.tv_splash_fox);
        iv_splash_fox = (ImageView)findViewById(R.id.iv_splash_fox);

        //fuentes
        Typeface myFont = Typeface.createFromAsset(getAssets(),"AmaticSC-Regular.ttf");
        //Typeface myFont2 = Typeface.createFromAsset(getAssets(),"budmo.tff");
        tv_splash_fox.setTypeface(myFont);
        // textView2.setTypeface(myFont2);

        //Imagen va apareciendo y el texto se desplaza desde fuera(dere) ala izquierda
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.pulse);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);

        tv_splash_fox.startAnimation(myanim);
        iv_splash_fox.startAnimation(myanim2);

        myanim.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

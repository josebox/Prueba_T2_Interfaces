package com.example.jose.prueba_t2_interfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);

        Intent intent = new Intent(this,SplashActivity.class);
        //creamos una tarea que es el login y eliminamos la tarea anterior que es el main
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}

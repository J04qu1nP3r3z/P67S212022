package com.example.p67s212022;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        /* Agregamos el Post de lay que realizara el show a la siguiente pantalla que es PrincipalActivity
        *  desde la pantalla de InicialActivity
        */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(InicialActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}
package com.example.examenrecopilatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static  Destino destinos[]=new Destino[]{
        new Destino("ZonaA","Europa","10"),
        new Destino("ZonaB","Ameria","30"),
        new Destino("ZonaC","Asia","20")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

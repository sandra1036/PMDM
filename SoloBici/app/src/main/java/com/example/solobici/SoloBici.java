package com.example.solobici;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoloBici extends AppCompatActivity {
    private Button bJuego;
    private Button bPreferencias;
    private Button bAcercaDe;
    private Button bSalir;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_bici);

        bJuego=(Button)findViewById(R.id.Boton01);

        bJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SoloBici.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        bAcercaDe=(Button)findViewById(R.id.Boton03);
//        bAcercaDe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SoloBici.this,Acerca.class);
//            }
//        });






    }







}

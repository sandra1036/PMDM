package com.example.examenrecopilatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaEnvio extends AppCompatActivity {

    protected Destino destino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_envio);
        TextView textZonaEn=(TextView)findViewById(R.id.zonaEn);
        TextView textView=(TextView)findViewById(R.id.tarifaenvio);
        TextView textView1=(TextView)findViewById(R.id.pesoenvio);
        TextView textView2=(TextView)findViewById(R.id.decoracionenvio);
        TextView textView3=(TextView)findViewById(R.id.costefinal);


        destino=(Destino)getIntent().getSerializableExtra("clave");

        textZonaEn.setText("Zona: "+destino.getZona());
        textView.setText("Continente: "+destino.getContinente());
        textView3.setText("Coste Final: "+destino.getPrecio());


    }
}

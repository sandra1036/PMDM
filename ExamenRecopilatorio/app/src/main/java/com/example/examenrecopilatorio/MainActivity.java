package com.example.examenrecopilatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double por;
    public TextView textPre;
    public static  Destino destinos[]=new Destino[]{
        new Destino("ZonaA","Europa","10"),
        new Destino("ZonaB","Ameria","30"),
        new Destino("ZonaC","Asia","20")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spn=(Spinner)findViewById(R.id.szona);
        CheckBox ch=(CheckBox)findViewById(R.id.checkboxregalo);
        CheckBox ch2=(CheckBox)findViewById(R.id.checkboxtarjeta);
        RadioGroup rg=(RadioGroup)findViewById(R.id.grup);
        TextView textZ=(TextView)findViewById(R.id.zonaS);
        TextView textC=(TextView)findViewById(R.id.continente);
        textPre=(TextView)findViewById(R.id.precio);
        rg.clearCheck();


        AdaptadorZona az=new AdaptadorZona(MainActivity.this);
        spn.setAdapter(az);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                String mensaje = "";
                mensaje = "Item clicked => " + destinos[position];
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();




            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String op="";

                if(group.getCheckedRadioButtonId()==R.id.tarifanormal){
                   textPre;
                }
                if(group.getCheckedRadioButtonId()==R.id.tarifaurgente){
                    por=0.3;

                }





            }
        });


    }
}

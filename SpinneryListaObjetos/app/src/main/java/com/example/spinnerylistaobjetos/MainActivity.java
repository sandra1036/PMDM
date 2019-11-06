package com.example.spinnerylistaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView textViewN;
    public static TextView textViewC;

    public static Ciclos[] ciclos=new Ciclos[]{
            new Ciclos("DAM","1"),
            new Ciclos("DAM","2")
    };
    public static ListaAsignaturas[]listaAsignaturas=new ListaAsignaturas[]{
            new ListaAsignaturas("SI","DA","LMI"," "," "," "),
            new ListaAsignaturas("AD","DIN","SGE","EIAS"," "," ")
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewN=(TextView)findViewById(R.id.nombre);
        textViewC=(TextView)findViewById(R.id.curso);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        AdatadorCiclos adatadorCiclos=new AdatadorCiclos(this);
        spinner.setAdapter(adatadorCiclos);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                ListaAsignaturas.listaAsignaturas();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

package com.example.spinnerylistaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static TextView textViewN;
    public static TextView textViewC;

    public static Ciclos[] ciclos=new Ciclos[]{
            new Ciclos("DAM","1"),
            new Ciclos("SMR","2")
    };
    public static ListaAsignaturas[]listaAsignaturas=new ListaAsignaturas[]{
            new ListaAsignaturas("SI","DA","LMI","INGLES","ED","Programacion "),
            new ListaAsignaturas("AD","DIN","SGE","EIAS","Ingles" ,"PSP")
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewN=(TextView)findViewById(R.id.nombre);
        textViewC=(TextView)findViewById(R.id.curso);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        AdatadorCiclos adatadorCiclos=new AdatadorCiclos(MainActivity.this);
        spinner.setAdapter(adatadorCiclos);
        final ListView listView=(ListView)findViewById(R.id.list);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                String mensaje = "";
                mensaje = "=> Nombre del curso: " + ciclos[position].getNombre() + "Curso:" + ciclos[position].getCurso();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();

                AdaptadorLista adaptadorLista = new AdaptadorLista(MainActivity.this);
                listView.setAdapter(adaptadorLista);

                TextView textA1 = (TextView) findViewById(R.id.asignatura1);
                textA1.setText(listaAsignaturas[position].getAsignatura());

                TextView textA2 = (TextView) findViewById(R.id.asignatura2);
                textA2.setText(listaAsignaturas[position].getAsignatura2());

                TextView textA3 = (TextView) findViewById(R.id.asignatura3);
                textA3.setText(listaAsignaturas[position].getAsignatura3());

                TextView textA4 = (TextView) findViewById(R.id.asignatura4);
                textA4.setText(listaAsignaturas[position].getAsignatura4());


                TextView textA5 = (TextView) findViewById(R.id.asignatura5);
                textA5.setText(listaAsignaturas[position].getAsignatura5());

                TextView textA6 = (TextView) findViewById(R.id.asignatura6);
                textA6.setText(listaAsignaturas[position].getAsignatura6());
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

package com.example.objetosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textN=(TextView)findViewById(R.id.nombre);
        TextView textA=(TextView)findViewById(R.id.apellidos);
        TextView textE=(TextView)findViewById(R.id.edad);

        Persona per=(Persona)getIntent().getSerializableExtra("CLAVEper");
        Toast.makeText(Main2Activity.this,per.toString(), Toast.LENGTH_LONG).show();

        textN.setText("Nombre: "+per.getNombre());
        textA.setText("Apellido: "+per.getApellido());
        textE.setText("Edad: "+per.getEdad());
    }
}

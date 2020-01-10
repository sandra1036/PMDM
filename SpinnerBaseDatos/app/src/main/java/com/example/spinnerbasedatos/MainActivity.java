package com.example.spinnerbasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spn;


 /*   private Persona[] persona = {
            new Persona("1", "Willson", "655444402"),
            new Persona("2", "Kreimer", "5453454354"),
            new Persona("3", "Cranell", "65564564564"),
    }; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spinner);
        AdaptadorPersona ap=new AdaptadorPersona(MainActivity.this);
        spn.setAdapter(ap);
    }



    public class AdaptadorPersona extends ArrayAdapter<Persona> {
        Activity context;

        public AdaptadorPersona(Activity context) {
            super(context, R.layout.desplegable, persona);
            this.context = context;
        }

        public View getDropDownView(int position, View view, ViewGroup viewGroup) {
            View viewDesplegada = getView(position, view, viewGroup);
            return viewDesplegada;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.desplegable, null);

            TextView textnombre = (TextView) item.findViewById(R.id.codigo);
            textnombre.setText(persona[i].getCodigo());

            TextView textApellido = (TextView) item.findViewById(R.id.nombre);
            textApellido.setText(persona[i].getNombre());

            TextView textEdad=(TextView)item.findViewById(R.id.telefono);
            textEdad.setText(persona[i].getTelefono());

            return item;
        }


    }



}



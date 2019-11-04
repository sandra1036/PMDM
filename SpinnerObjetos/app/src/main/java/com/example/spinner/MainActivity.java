package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Spinner spinner;

    private Persona[] personas={
            new Persona("Úrsula","Yelmo"),
            new Persona("Pablo","Hernandez"),
            new Persona("Oscar","Alvarado")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=(Spinner)findViewById(R.id.spinner);

        AdaptadorPersona adaptadorPersona=new AdaptadorPersona(MainActivity.this);
        spinner.setAdapter(adaptadorPersona);

        final ImageView imageView=(ImageView)findViewById(R.id.foto);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                String mensaje="";
                mensaje="Item clicked => "+ personas[position];

                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }



    public class AdaptadorPersona extends ArrayAdapter<Persona> {
        Activity context;

        public AdaptadorPersona(Activity context){
            super(context,R.layout.desplegable,personas);
            this.context=context;
        }

        public View getDropDownView(int position,View  view, ViewGroup viewGroup){
            View viewDesplegada= getView(position, view,viewGroup);
            return  viewDesplegada;
        }

        public View getView(int i, View view, ViewGroup viewGroup){
            LayoutInflater inflater= context.getLayoutInflater();
            View item=inflater.inflate(R.layout.desplegable,null);

            TextView textnombre=(TextView)item.findViewById(R.id.nombre);
            textnombre.setText(personas[i].getNombre());

            TextView textApellido=(TextView)item.findViewById(R.id.apellidos);
            textApellido.setText(personas[i].getApellido());



            return item;
        }








    }
}
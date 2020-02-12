package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.icu.text.MessagePattern;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectolibreria.R;




public class LIbroCompleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro_completo);

        TextView nombre=(TextView)findViewById(R.id.nombre);
        TextView fecha=(TextView)findViewById(R.id.fecha);
        TextView sinopsis=(TextView)findViewById(R.id.sinopis);
        ImageView imagen=(ImageView)findViewById(R.id.foto);
        TextView autor=(TextView)findViewById(R.id.autor);
        TextView genero=(TextView)findViewById(R.id.genero);
        final TextView precio=(TextView)findViewById(R.id.precio);

        RadioGroup rg=(RadioGroup)findViewById(R.id.radiogrup);
        final RadioButton re=(RadioButton)findViewById(R.id.Ebook);
        final RadioButton rf=(RadioButton)findViewById(R.id.Fisico);
        Button siguiente=(Button)findViewById(R.id.siguiente);


        //Obtengo los datos del objeto de los libros
        Bundle bundle=getIntent().getExtras();
        Libros libros=(Libros)bundle.getSerializable("clave");


        //Se los asigno
        genero.setText("Genero: "+libros.getGenero());
        imagen.setImageResource(libros.getFoto());
        nombre.setText("Titulo: "+libros.getTitulo());
        autor.setText("Autor: "+libros.getAutor());
        fecha.setText("Fecha: "+libros.getFecha());
        sinopsis.setText("Sinopsis: "+libros.getSinopsis());
        precio.setText("Precio: "+libros.getPrecio());


        //Metodos del radio Grup
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            int precio=20;
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(rf.isChecked()==true){
                    precio=precio+5;


                }
            }
        });








    }
}

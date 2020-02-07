package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

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
        TextView precio=(TextView)findViewById(R.id.precio);

        RadioButton re=(RadioButton)findViewById(R.id.Ebook);
        RadioButton rf=(RadioButton)findViewById(R.id.Fisico);
        Button siguiente=(Button)findViewById(R.id.siguiente);

        Bundle bundle=getIntent().getExtras();
        Libros libros=(Libros)bundle.getSerializable("clave");

        genero.setText("Genero: "+libros.getGenero());
        imagen.setImageResource(libros.getFoto());
        nombre.setText("Titulo: "+libros.getTitulo());
        autor.setText("Autor: "+libros.getAutor());
        fecha.setText("Fecha: "+libros.getFecha());
        sinopsis.setText("Sinopsis: "+libros.getSinopsis());


    }
}

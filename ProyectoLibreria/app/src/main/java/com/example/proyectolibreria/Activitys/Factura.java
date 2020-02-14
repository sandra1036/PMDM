package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyectolibreria.R;


public class Factura extends AppCompatActivity {
    private View frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        ImageView imageView=(ImageView)findViewById(R.id.imagen);
        TextView titulo=(TextView)findViewById(R.id.LibroFact);
        TextView precio=(TextView)findViewById(R.id.Precio);
        TextView preciofisico=(TextView)findViewById(R.id.PreFisico);


        Bundle bundle=getIntent().getExtras();
//        final Libros libros=(Libros)bundle.getSerializable("clave");



/*
        imageView.setImageResource(libros.getFoto());
        titulo.setText("Titulo: "+libros.getTitulo());
        precio.setText("Precio"+libros.getPrecio());
        preciofisico.setText("Precio por ser Físico : +5");
*/

        frag=(View)findViewById(R.id.fragmento);



    }





}

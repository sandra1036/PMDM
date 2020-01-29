package com.example.proyectolibreria.Adaptador;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.proyectolibreria.Activitys.Libros;
import com.example.proyectolibreria.Activitys.Principal;
import com.example.proyectolibreria.R;



public class AdaptadorLibreria extends ArrayAdapter<Libros> {
    Activity activity;
    public AdaptadorLibreria(Activity activity) {
        super(activity, R.layout.desplegar,Principal.libros);
        this.activity=activity;
    }
    public View getView(int position, View view,ViewGroup viewGroup){
        LayoutInflater inflater=activity.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegar,null);

        ImageView foto=(ImageView) item.findViewById(R.id.foto);
        foto.setImageResource(Principal.libros[position].getFoto());

        TextView textViewtitulo=(TextView)item.findViewById(R.id.nombre);
        textViewtitulo.setText(Principal.libros[position].getTitulo());

        TextView textViewautor=(TextView)item.findViewById(R.id.autor);
        textViewautor.setText(Principal.libros[position].getAutor());

        TextView textViewfecha=(TextView)item.findViewById(R.id.fecha);
        textViewautor.setText(Principal.libros[position].getFecha());

        TextView textViewsinopsis=(TextView)item.findViewById(R.id.sinopis);
        textViewsinopsis.setText(Principal.libros[position].getSinopsis());

        TextView textViewgenero=(TextView)item.findViewById(R.id.genero);
        textViewgenero.setText(Principal.libros[position].getGenero());

        return item;
    }
}

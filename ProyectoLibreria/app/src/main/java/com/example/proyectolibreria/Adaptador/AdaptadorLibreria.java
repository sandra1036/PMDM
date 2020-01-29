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
import com.example.proyectolibreria.R;

public class AdaptadorLibreria extends ArrayAdapter<Libros> {
    Activity activity;
    public AdaptadorLibreria(Activity activity) {
        super(activity, R.layout.desplegar);
        this.activity=activity;
    }
    public View getDropDownView(int position, View view, ViewGroup viewGroup){
        View vista=getView(position,view,viewGroup);
        return  vista;
    }
    public View getView(int position, View view,ViewGroup viewGroup){
        LayoutInflater inflater=activity.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegar,null);

        ImageView foto=(TextView)item.findViewById(R.id.foto);
        foto.setImageResource(R.dra);

        TextView textViewMar=(TextView)item.findViewById(R.id.marca);
        textViewMar.setText(MainActivity.seleccionado[position].getMarca());

        TextView textViewPre=(TextView)item.findViewById(R.id.precio);
        textViewPre.setText(MainActivity.seleccionado[position].getPrecio());

        ImageView imageView=(ImageView)item.findViewById(R.id.foto);
        imageView.setImageResource(MainActivity.seleccionado[position].getImagen());
        return item;
    }
}

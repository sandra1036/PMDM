package com.example.examennoviembresolucion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorTransporte extends ArrayAdapter<MedioTransporte> {
    Activity activity;

    public AdaptadorTransporte(Activity activity){
        super(activity,R.layout.activity_adaptador_transporte,MainActivity.seleccionado);
        this.activity=activity;
    }
    public View getDropDownView(int position, View view, ViewGroup viewGroup){
        View vista=getView(position,view,viewGroup);
        return  vista;
    }
    public View getView(int position, View view,ViewGroup viewGroup){
        LayoutInflater inflater=activity.getLayoutInflater();
        View item=inflater.inflate(R.layout.activity_adaptador_transporte,null);

        TextView textViewM=(TextView)item.findViewById(R.id.movilidad);
        textViewM.setText(MainActivity.seleccionado[position].getMovilidad());

        TextView textViewMar=(TextView)item.findViewById(R.id.marca);
        textViewMar.setText(MainActivity.seleccionado[position].getMarca());

        TextView textViewPre=(TextView)item.findViewById(R.id.precio);
        textViewPre.setText(MainActivity.seleccionado[position].getPrecio());

        ImageView imageView=(ImageView)item.findViewById(R.id.foto);
        imageView.setImageResource(MainActivity.seleccionado[position].getImagen());
        return item;
    }

}

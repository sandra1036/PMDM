package com.example.examenandroidnoviembre;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorTransportePatinete extends ArrayAdapter<MedioTransporte> {

    Activity context;

    public AdaptadorTransportePatinete(Activity context2){
        super(context2,R.layout.desplegable,MainActivity.electricos);
        this.context=context2;
    }

    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){

        View desplegada=getView(posicion,view,viewGroup);
        return desplegada;

    }
    public View getView(int posicion,View view,ViewGroup viewGroup){

        LayoutInflater inflater=context.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegable,null);

        TextView textViewM=(TextView)item.findViewById(R.id.movilidad);
        textViewM.setText(MainActivity.electricos[posicion].getMovilidad());

        TextView textViewMar=(TextView)item.findViewById(R.id.marca);
        textViewMar.setText(MainActivity.electricos[posicion].getMarca());


        TextView textViewPre=(TextView)item.findViewById(R.id.precio);
        textViewPre.setText(MainActivity.electricos[posicion].getPrecio());

        ImageView imageView=(ImageView)item.findViewById(R.id.foto);
        imageView.setImageResource(MainActivity.electricos[posicion].getImagen());


        return  item;
    }








}



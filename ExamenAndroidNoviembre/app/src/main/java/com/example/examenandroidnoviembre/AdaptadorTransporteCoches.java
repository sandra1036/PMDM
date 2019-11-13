package com.example.examenandroidnoviembre;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorTransporteCoches extends ArrayAdapter<MedioTransporte> {


    Activity context;

    public AdaptadorTransporteCoches(Activity context){
        super(context,R.layout.desplegable,MainActivity.coches);
        this.context=context;
    }

    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){

        View desplegada=getView(posicion,view,viewGroup);
        return desplegada;

    }
    public View getView(int posicion,View view,ViewGroup viewGroup){

        LayoutInflater inflater=context.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegable,null);

        TextView textViewM=(TextView)item.findViewById(R.id.movilidad);
        textViewM.setText(MainActivity.coches[posicion].getMovilidad());

        TextView textViewMar=(TextView)item.findViewById(R.id.marca);
        textViewMar.setText(MainActivity.coches[posicion].getMarca());


        TextView textViewPre=(TextView)item.findViewById(R.id.precio);
        textViewPre.setText(MainActivity.coches[posicion].getPrecio());

        ImageView imageView=(ImageView)item.findViewById(R.id.foto);
        imageView.setImageResource(MainActivity.coches[posicion].getImagen());


        return  item;
    }




}

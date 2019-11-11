package com.example.spinnerylistaobjetos;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdatadorCiclos extends ArrayAdapter<Ciclos> {
    Activity actividad;

    public AdatadorCiclos(Activity actividad){
        super(actividad,R.layout.desplegable,MainActivity.ciclos);
        this.actividad=actividad;
    }
    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){

        View desplegada=getView(posicion,view,viewGroup);
        return desplegada;

    }
    public View getView(int posicion,View view,ViewGroup viewGroup){

        LayoutInflater inflater=actividad.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegable,null);

        TextView textViewN=(TextView)item.findViewById(R.id.nombre);
        textViewN.setText(MainActivity.ciclos[posicion].getNombre());

//        TextView textViewC=(TextView)item.findViewById(R.id.curso);
//        textViewN.setText(MainActivity.ciclos[posicion].getCurso());




        return  item;
    }
}
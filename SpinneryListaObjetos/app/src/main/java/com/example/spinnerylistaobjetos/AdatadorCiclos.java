package com.example.spinnerylistaobjetos;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdatadorCiclos extends ArrayAdapter<Ciclos> {
    public Activity actividad;

    public AdatadorCiclos(Activity activity){
        super(activity,R.layout.desplegable,MainActivity.ciclos);
        this.actividad=activity;
    }
    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){

        View desplegada=getView(posicion,view,viewGroup);
        return desplegada;

    }
    public View getView(int posicion,View view,ViewGroup viewGroup){
        LayoutInflater inflater=actividad.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegable,null);

        MainActivity.textViewN.setText(MainActivity.ciclos[posicion].getNombre());
        MainActivity.textViewC.setText(MainActivity.ciclos[posicion].getCurso());


        return  item;
    }







}

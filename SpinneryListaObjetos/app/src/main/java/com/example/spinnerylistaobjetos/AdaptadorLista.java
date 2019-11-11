package com.example.spinnerylistaobjetos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdaptadorLista extends ArrayAdapter<ListaAsignaturas> {
    Activity activity;

    public AdaptadorLista(Activity context){
        super(context,R.layout.lista_item,MainActivity.listaAsignaturas);
        this.activity=context;
    }
    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){

        View desplegada=getView(posicion,view,viewGroup);
        return desplegada;

    }
    public View getView(int posicion,View view,ViewGroup viewGroup){
        LayoutInflater inflater=activity.getLayoutInflater();
        View item=inflater.inflate(R.layout.lista_item,null);

        TextView textasignatura1=(TextView)item.findViewById(R.id.asignatura1);
        textasignatura1.setText(MainActivity.listaAsignaturas[posicion].getAsignatura());

        TextView textasignatura2=(TextView)item.findViewById(R.id.asignatura2);
        textasignatura2.setText(MainActivity.listaAsignaturas[posicion].getAsignatura2());

        TextView textasignatura3=(TextView)item.findViewById(R.id.asignatura3);
        textasignatura3.setText(MainActivity.listaAsignaturas[posicion].getAsignatura3());

        TextView textasignatura4=(TextView)item.findViewById(R.id.asignatura4);
        textasignatura4.setText(MainActivity.listaAsignaturas[posicion].getAsignatura4());

        TextView textasignatura5=(TextView)item.findViewById(R.id.asignatura5);
        textasignatura5.setText(MainActivity.listaAsignaturas[posicion].getAsignatura5());


        return  item;
    }

}

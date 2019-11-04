package com.example.spinnerylistaobjetos;

import android.app.Activity;
import android.widget.ArrayAdapter;

public class AdaptadorLista extends ArrayAdapter<ListaAsignaturas> {
    Activity activity;

    public AdaptadorLista(Activity context){
        super(context,R.layout.lista_item,)
    }
}

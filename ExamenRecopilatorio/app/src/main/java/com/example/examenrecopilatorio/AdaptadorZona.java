package com.example.examenrecopilatorio;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AdaptadorZona extends ArrayAdapter<Destino> {
    Activity context;

    public AdaptadorZona(Activity context){
        super(context,R.layout.desplegable,MainActivity.destinos);
        this.context=context;
    }

    public View getDropDownView(int posicion, View view, ViewGroup viewGroup){
        View vdesple=getView(posicion,view,viewGroup);
        return vdesple;
    }

    public View getView(int i,View view, ViewGroup viewGroup){
        LayoutInflater inflater=context.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegable,null);

        TextView textzona=(TextView)item.findViewById(R.id.zonaS);
        textzona.setText(MainActivity.destinos[i].getZona());

        TextView textconti=(TextView)item.findViewById(R.id.continente);
        textconti.setText(MainActivity.destinos[i].getContinente());

        TextView textPre=(TextView)item.findViewById(R.id.precio);
        textPre.setText(MainActivity.destinos[i].getPrecio());


        return item;

    }
}

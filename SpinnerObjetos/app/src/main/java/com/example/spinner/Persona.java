package com.example.spinner;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by angel on 22/09/2016.
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int foto;


    Persona (String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;

    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getFoto(){
        return foto;
    }


    public void setNombre(String nuevoNom){
        nombre=nuevoNom;
    }
    public void setApellido(String nuevoApe){
        apellido= nuevoApe;
    }


    public String toString(){
        String cad="";
        cad+="NOMBRE:"+ nombre+ " APELLIDO:" + apellido ;
        return cad;
    }

}

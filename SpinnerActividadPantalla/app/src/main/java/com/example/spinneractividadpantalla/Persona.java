package com.example.spinneractividadpantalla;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by angel on 22/09/2016.
 */
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int imageView;

    Persona (String nombre,String apellido,int imageView){
        this.nombre=nombre;
        this.apellido=apellido;
        this.imageView=imageView;

    }

    public String getNombre (){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getImageView(){return imageView;}


    public void setNombre(String nuevoNom){
        nombre=nuevoNom;
    }
    public void setApellido(String nuevoApe){
        apellido= nuevoApe;
    }
    public void setImageView(int imageView){imageView=imageView;}



    public String toString(){
        String cad="";
        cad+="NOMBRE:"+ nombre+ " APELLIDO:" + apellido ;
        return cad;
    }

}

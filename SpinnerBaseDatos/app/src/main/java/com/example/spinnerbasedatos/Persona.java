package com.example.spinnerbasedatos;

import java.io.Serializable;

public class Persona implements Serializable{
    private String codigo,nombre,telefono;

   Persona(String codigo, String nombre, String telefono){
       this.codigo=codigo;
       this.nombre=nombre;
       this.telefono=telefono;

   }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String toString(){
        String cad="";
        cad+="Codigo:"+ codigo+ " Nombre:" + nombre + "Telefono: " + telefono ;
        return cad;
    }


}

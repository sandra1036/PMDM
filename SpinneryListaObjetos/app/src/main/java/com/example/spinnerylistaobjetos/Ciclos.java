package com.example.spinnerylistaobjetos;

import java.io.Serializable;

public class Ciclos implements Serializable {
    String nombre,curso;

 public Ciclos(String nombre,String curso){
     this.nombre=nombre;
     this.curso=curso;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

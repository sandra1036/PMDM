package com.example.spinnerylistaobjetos;

import java.io.Serializable;

public class ListaAsignaturas implements Serializable {

    String asignatura;
  public ListaAsignaturas(String asignatura){
      this.asignatura=asignatura;
  }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}

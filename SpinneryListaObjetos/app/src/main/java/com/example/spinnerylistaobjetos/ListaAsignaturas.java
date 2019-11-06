package com.example.spinnerylistaobjetos;

import java.io.Serializable;

public class ListaAsignaturas implements Serializable {

    String asignatura1,asignatura2,asignatura3,asignatura4,asignatura5,asignatura6;
  public ListaAsignaturas(String asignatura1,String asignatura2,String asignatura3,String asignatura4,String asignatura5,String asignatura6){

      this.asignatura1=asignatura1;
      this.asignatura2=asignatura2;
      this.asignatura3=asignatura3;
      this.asignatura4=asignatura4;
      this.asignatura5=asignatura5;
      this.asignatura6=asignatura6;
  }

    public String getAsignatura() {
        return asignatura1;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura1 = asignatura;
    }


    public String getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public String getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(String asignatura3) {
        this.asignatura3 = asignatura3;
    }

    public String getAsignatura4() {
        return asignatura4;
    }

    public void setAsignatura4(String asignatura4) {
        this.asignatura4 = asignatura4;
    }

    public String getAsignatura5() {
        return asignatura5;
    }

    public void setAsignatura5(String asignatura5) {
        this.asignatura5 = asignatura5;
    }

    public String getAsignatura6() {
        return asignatura6;
    }

    public void setAsignatura6(String asignatura6) {
        this.asignatura6 = asignatura6;
    }
}

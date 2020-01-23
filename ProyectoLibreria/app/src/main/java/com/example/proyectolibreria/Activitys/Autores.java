package com.example.proyectolibreria.Activitys;

import java.io.Serializable;

public class Autores implements Serializable {
    private String nombre,apellidos,fechanacimiento,edad,nacionalidad;
    private int foto;

    public Autores(int foto,String nombre,String apellidos,String fechanacimiento,String edad,String nacionalidad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechanacimiento=fechanacimiento;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

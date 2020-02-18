package com.example.proyectolibreria.Activitys;

public class Usuarios {
    private String nombre,contrasenya;



    public Usuarios(){

    }

    public Usuarios(String nombre,String contrasenya){
        this.nombre=nombre;
        this.contrasenya=contrasenya;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
}

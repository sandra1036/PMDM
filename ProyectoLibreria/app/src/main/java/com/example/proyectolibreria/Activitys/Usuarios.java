package com.example.proyectolibreria.Activitys;

public class Usuarios {
    public static int id;
    public static String nombre,contrasenya;



    public Usuarios(){

    }

    public Usuarios(String nombre,String contrasenya){
        this.nombre=nombre;
        this.contrasenya=contrasenya;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Usuarios.id = id;
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

package com.example.proyectolibreria.Activitys;

public class Usuarios {
    private String nombre,email,telefono;



    public Usuarios(){

    }

    public Usuarios(String nombre,String email,String telefono){
        this.nombre=nombre;
        this.email=email;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

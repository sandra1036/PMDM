package com.example.proyectolibreria.Activitys;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo,autor,fecha,sinopsis;
    private  int foto;


   public Libros(int foto,String titulo,String autor,String fecha,String sinopsis){
        this.foto=foto;
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
        this.sinopsis=sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}

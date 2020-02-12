package com.example.proyectolibreria.Activitys;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo,autor,fecha,sinopsis,genero,precio;
    private  int foto;


   public Libros(int foto,String titulo,String autor,String fecha,String sinopsis,String genero,String precio){
        this.foto=foto;
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.precio=precio;
    }



    public Libros(int foto,String titulo,String autor,String fecha,String genero){
        this.foto=foto;
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
        this.genero=genero;

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

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

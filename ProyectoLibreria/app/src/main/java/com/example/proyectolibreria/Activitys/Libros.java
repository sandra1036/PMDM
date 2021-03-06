package com.example.proyectolibreria.Activitys;

import java.io.Serializable;

public class Libros implements Serializable {
    private String titulo,autor,fecha,sinopsis,genero,precio,total;
    private int foto,iduser;
    public static int id;


   public Libros(int foto,String titulo,String autor,String fecha,String sinopsis,String genero,String precio){
        this.foto=foto;
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
        this.sinopsis=sinopsis;
        this.genero=genero;
        this.precio=precio;
    }


    public Libros(){

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


    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
}

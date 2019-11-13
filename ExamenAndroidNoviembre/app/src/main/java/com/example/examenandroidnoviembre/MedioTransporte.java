package com.example.examenandroidnoviembre;

import android.widget.TextView;

import java.io.Serializable;

public class MedioTransporte implements Serializable {
    private String movilidad,marca,precio;
    private int imagen;


    public MedioTransporte(String movilidad, String marca, String precio, int imagen) {
            this.movilidad=movilidad;
            this.marca=marca;
            this.precio=precio;
            this.imagen=imagen;

    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}

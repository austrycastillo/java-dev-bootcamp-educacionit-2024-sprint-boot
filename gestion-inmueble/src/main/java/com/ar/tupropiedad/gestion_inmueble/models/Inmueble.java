package com.ar.tupropiedad.gestion_inmueble.models;

public class Inmueble {
    private String id;
    private String tipo;
    private int tamanio;
    private double precio;

    public Inmueble(String id, String tipo, int tamanio, double precio) {
        this.id = id;
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public Inmueble() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}

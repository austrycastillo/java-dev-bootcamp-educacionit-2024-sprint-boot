package com.clase45.clase45.tres;

public class Telefono {
    private String numero;

    public Telefono() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numero='" + numero + '\'' +
                '}';
    }
}

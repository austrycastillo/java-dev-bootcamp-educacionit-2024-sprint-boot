package com.clase45.clase45.uno;

public class Uno {
    private int id;
    private String nombre;

    public Uno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Uno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
    public  void mostrarNombre(){
        System.out.println(this.nombre);
    }
}

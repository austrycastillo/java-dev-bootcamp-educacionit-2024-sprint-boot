package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
//obligatoriamente debe tener constructor, setter y getter
@Entity
@Table(name = "paisajes")
public class Paisaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaisaje;
    @Column(length = 50, nullable = false,unique = true)
    private String nombre;
    @Column(length = 60)
    private String localizacion;
    @Column(length = 10, nullable = false)
    private int km;
    public Paisaje() {}

    public int getIdPaisaje() {
        return idPaisaje;
    }

    public void setIdPaisaje(int idPaisaje) {
        this.idPaisaje = idPaisaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Paisaje(int idPaisaje, String nombre, String localizacion, int km) {
        this.idPaisaje = idPaisaje;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.km = km;
    }
}

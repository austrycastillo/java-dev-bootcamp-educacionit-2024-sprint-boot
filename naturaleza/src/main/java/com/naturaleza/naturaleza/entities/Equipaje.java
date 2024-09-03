package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "equipajes")
public class Equipaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 10, nullable = false)
    private double peso;

    public Equipaje() {
    }

    public Equipaje(int id, double peso) {
        this.id = id;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

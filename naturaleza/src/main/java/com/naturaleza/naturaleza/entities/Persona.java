package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true,nullable = true,name = "identificacion")
    private String dni;
    @Column(nullable = false,length = 30)
    private String nombre;
    @Column(nullable = false,length = 30)
    private String apellido;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

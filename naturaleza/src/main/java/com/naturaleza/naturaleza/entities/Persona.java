package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

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
//    @OneToOne
//    private Domicilio domicilio;
    @OneToMany(
            mappedBy = "persona",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Domicilio> domicilio;
    public Persona() {
    }

    public Persona(int id, String dni, String nombre, String apellido, List<Domicilio> domicilio) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Domicilio> getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(List<Domicilio> domicilio) {
        this.domicilio = domicilio;
    }
}

package com.naturaleza.naturaleza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
//REQUISITO OBLIGATORIO TENER CONSTRUCTOR CON TODOS LOS ATRIBUTOS
//TAMBIEN SETTERS Y GETTERS
@Entity
@Table(name = "domicilios")
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(length = 150)
    private String direccion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona")
    private Persona persona;
    public Domicilio() {
    }

    public Domicilio(int codigo, String direccion, Persona persona) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.persona = persona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "codigo=" + codigo +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

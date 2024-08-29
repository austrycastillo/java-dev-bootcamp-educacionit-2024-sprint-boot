package com.clase45.clase45.dos;

public class Dos {
    private String mensaje;

    public Dos() {
    }

    public Dos(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Dos{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
    public  void mostrarMensaje(){
        System.out.println(getMensaje());
    }
}

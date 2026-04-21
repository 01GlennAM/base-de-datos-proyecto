package com.example;

public class Rol {

    private int idRol;
    private String nombre; // ADMIN, INSTRUCTOR, ESTUDIANTE

    public Rol(int idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol{id=" + idRol +
                ", nombre='" + nombre + "'}";
    }
}

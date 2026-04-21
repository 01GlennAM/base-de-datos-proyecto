package com.example;

import java.sql.Date;

public class ProgresoLeccion {

    private Inscripcion inscripcion;
    private Leccion leccion;
    private boolean completado;
    private Date fechaCompletado;

    public ProgresoLeccion(Inscripcion inscripcion, Leccion leccion, boolean completado, Date fechaCompletado) {

        this.inscripcion = inscripcion;
        this.leccion = leccion;
        this.completado = completado;
        this.fechaCompletado = fechaCompletado;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Leccion getLeccion() {
        return leccion;
    }

    public void setLeccion(Leccion leccion) {
        this.leccion = leccion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public Date getFechaCompletado() {
        return fechaCompletado;
    }

    public void setFechaCompletado(Date fechaCompletado) {
        this.fechaCompletado = fechaCompletado;
    }

    @Override
    public String toString() {
        return "ProgresoLeccion{leccion=" +
                (leccion != null ? leccion.getTitulo() : "null") +
                ", completado=" + completado +
                "}";
    }
}
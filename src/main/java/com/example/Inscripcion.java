package com.example;

import java.sql.Date;

public class Inscripcion { /* comentarios */

    private int idInscripcion;
    private Usuario usuario;
    private Curso curso;
    private Date fechaInscripcion;
    private EstadoInscripcion estado;
    private double porcentajeProgreso;
    private Nivel nivel;
    private double valor;

    // ENUMS es como un menú
    public enum EstadoInscripcion {
        ACTIVA,
        CANCELADA,
        COMPLETADA
    }

    public enum Nivel {
        BASICO,
        INTERMEDIO,
        AVANZADO
    }

    


    // CONSTRUCTOR

    public Inscripcion(int idInscripcion, Usuario usuario, Curso curso, Date fechaInscripcion, EstadoInscripcion estado,
            double porcentajeProgreso, Nivel nivel, double valor) {

        this.idInscripcion = idInscripcion;
        this.usuario = usuario;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
        this.estado = estado;
        this.porcentajeProgreso = porcentajeProgreso;
        this.nivel = nivel;
        this.valor = valor;
    }

    // GETTERS Y SETTERS

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public EstadoInscripcion getEstado() {
        return estado;
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public double getPorcentajeProgreso() {
        return porcentajeProgreso;
    }

    public void setPorcentajeProgreso(double porcentajeProgreso) {
        this.porcentajeProgreso = porcentajeProgreso;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Inscripcion{id=" + idInscripcion +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
                ", curso=" + (curso != null ? curso.getTitulo() : "null") +
                ", progreso=" + porcentajeProgreso +
                "%}";
    }
}
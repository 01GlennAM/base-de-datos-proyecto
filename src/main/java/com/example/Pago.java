package com.example;

import java.sql.Date;

public class Pago {

    private int idPago;
    private Usuario usuario;
    private Curso curso;
    private double valor;
    private MetodoPago metodoPago;
    private EstadoPago estado;
    private String idTransaccion;
    private Date fechaPago;

    // enum es un tipo de dato especial que solo permite valores definidos por ti
    // se crea un tipo de dato llamado metodopago y puede ser cualquier valor de
    // metodopago
    // no necesitan instanciar como un objeto por que ya estan
    // estado = EstadoPago.APROBADO; // no necesitas new pero en categoria si
    // necesito new
    public enum MetodoPago {
        TARJETA,
        PAYPAL,
        EFECTIVO
    }

    public enum EstadoPago {
        APROBADO,
        RECHAZADO
    }

    // CONSTRUCTOR
    public Pago(int idPago, Usuario usuario, Curso curso, double valor,
            MetodoPago metodoPago, EstadoPago estado,
            String idTransaccion, Date fechaPago) {

        this.idPago = idPago;
        this.usuario = usuario;
        this.curso = curso;
        this.valor = valor;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.idTransaccion = idTransaccion;
        this.fechaPago = fechaPago;
    }

    // GETTERS Y SETTERS

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{id=" + idPago +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
                ", curso=" + (curso != null ? curso.getTitulo() : "null") +
                ", valor=" + valor +
                ", estado=" + estado +
                "}";
    }
}
package pe.edu.upc.organicmarketbackend.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Orden")

public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrden;

    @Column(name="fechaCompra")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaCompra;

    @Column(name="fechaEnvio")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaEnvio;

    @Column(name="fechaEntrega")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaEntrega;

    @Column(name = "cantidad", length = 30, nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn (name="idAgricultor", nullable = false)
    private Agricultor agricultor;

    public Orden(int idOrden, LocalDate fechaCompra, LocalDate fechaEnvio, LocalDate fechaEntrega, int cantidad, Agricultor agricultor) {
        this.idOrden = idOrden;
        this.fechaCompra = fechaCompra;
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        this.cantidad = cantidad;
        this.agricultor = agricultor;
    }

    public Orden() {
        super();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }
}

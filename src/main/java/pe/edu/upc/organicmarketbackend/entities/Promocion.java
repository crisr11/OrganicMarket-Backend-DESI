package pe.edu.upc.organicmarketbackend.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Promocion")
public class Promocion {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromocion;
    @Column(name = "descuento", nullable = false)
    private double descuento;
    @Column(name = "fechaInicio")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate fechaFin;
    @ManyToOne
    @JoinColumn(name = "idAgricultor", nullable = false)
    private Agricultor agricultor;
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    public Promocion() {
    }
    public Promocion(int idPromocion, double descuento, LocalDate fechaInicio, LocalDate fechaFin, Agricultor agricultor, Producto producto) {
        this.idPromocion = idPromocion;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.agricultor = agricultor;
        this.producto = producto;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}

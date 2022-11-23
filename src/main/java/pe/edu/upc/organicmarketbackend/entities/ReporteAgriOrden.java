package pe.edu.upc.organicmarketbackend.entities;

import java.time.LocalDate;

public class ReporteAgriOrden {
    private  String nombrePersona;
    private  String direccionAgricultor;
    private String fechaCompra;

    public ReporteAgriOrden() {
    }

    public ReporteAgriOrden(String nombrePersona, String direccionAgricultor, String fechaCompra) {
        this.nombrePersona = nombrePersona;
        this.direccionAgricultor = direccionAgricultor;
        this.fechaCompra = fechaCompra;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getDireccionAgricultor() {
        return direccionAgricultor;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setDireccionAgricultor(String direccionAgricultor) {
        this.direccionAgricultor = direccionAgricultor;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}

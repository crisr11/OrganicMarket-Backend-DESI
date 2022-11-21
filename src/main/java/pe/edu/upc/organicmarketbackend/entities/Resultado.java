package pe.edu.upc.organicmarketbackend.entities;

import java.time.LocalDate;

public class Resultado {
    private String producto;
    private String fechaInicio;
    private String fechaFin;

    public Resultado(String producto, String fechaInicio, String fechaFin) {
        this.producto = producto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Resultado() {
    }
}

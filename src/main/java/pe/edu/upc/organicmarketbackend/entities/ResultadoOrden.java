package pe.edu.upc.organicmarketbackend.entities;

public class ResultadoOrden {
    private String orden;
    private String fechaCompra;
    private String cantidad;

    public ResultadoOrden() {
    }

    public ResultadoOrden(String orden, String fechaCompra, String cantidad) {
        this.orden = orden;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

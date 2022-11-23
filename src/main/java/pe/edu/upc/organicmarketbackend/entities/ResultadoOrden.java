package pe.edu.upc.organicmarketbackend.entities;

public class ResultadoOrden {
    private String orden;
    private String cantidad;

    public ResultadoOrden() {
    }

    public ResultadoOrden(String orden, String cantidad) {
        this.orden = orden;
        this.cantidad = cantidad;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

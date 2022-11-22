package pe.edu.upc.organicmarketbackend.entities;

public class ResultadoDetalleOrden {

    public String producto;

    public String cantidad;

    public ResultadoDetalleOrden() {
    }

    public ResultadoDetalleOrden(String producto, String cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}

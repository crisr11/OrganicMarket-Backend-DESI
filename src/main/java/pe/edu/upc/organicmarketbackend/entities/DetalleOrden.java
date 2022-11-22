package pe.edu.upc.organicmarketbackend.entities;


import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "DetalleOrden")
public class DetalleOrden implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrden;
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @Column(name = "cantidad", length = 30, nullable = false)
    private int cantidad;

    public DetalleOrden() {
    }

    public DetalleOrden(int idOrden, Producto producto, int cantidad) {
        this.idOrden = idOrden;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

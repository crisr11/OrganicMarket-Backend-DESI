package pe.edu.upc.organicmarketbackend.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    public DetalleOrden() {
        super();
    }

    public DetalleOrden(int idOrden, Producto producto) {
        this.idOrden = idOrden;
        this.producto = producto;
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
}

package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table (name = "Producto")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nameProducto", length = 70, nullable = false)
    private String nameProducto;

    @Column(name = "precio", length = 30, nullable = false)
    private int precio;


    @ManyToOne
    @JoinColumn(name = "idTipo", nullable = false)
    private Tipo tipo;

    public Producto() {
    }

    public Producto(int idProducto, String nameProducto, int precio, Tipo tipo) {
        this.idProducto = idProducto;
        this.nameProducto = nameProducto;
        this.precio = precio;

        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



    public int getIdProducto() {return idProducto;}

    public void setIdProducto(int idProducto) {this.idProducto = idProducto;}

    public String getNameProducto() {return nameProducto;}

    public void setNameProducto(String nameProducto) {this.nameProducto = nameProducto;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}



}

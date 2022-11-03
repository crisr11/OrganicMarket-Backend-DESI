package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(name = "contenido", length = 70, nullable = false)
    private String contenido;
    @ManyToOne
    @JoinColumn(name = "idAgricultor", nullable = false)
    private Agricultor agricultor;
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, String contenido, Agricultor agricultor, Producto producto) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.agricultor = agricultor;
        this.producto = producto;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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

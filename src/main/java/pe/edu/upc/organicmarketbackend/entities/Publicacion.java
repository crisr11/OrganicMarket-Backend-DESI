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
    @Column(name = "id_agricultor", nullable = false)
    private int id_agricultor;
    @Column(name = "id_producto", nullable = false)
    private int id_producto;

    public Publicacion() {
    }

    public Publicacion(int idPublicacion, String contenido, int id_agricultor, int id_producto) {
        this.idPublicacion = idPublicacion;
        this.contenido = contenido;
        this.id_agricultor = id_agricultor;
        this.id_producto = id_producto;
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

    public int getId_agricultor() {
        return id_agricultor;
    }

    public void setId_agricultor(int id_agricultor) {
        this.id_agricultor = id_agricultor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
}

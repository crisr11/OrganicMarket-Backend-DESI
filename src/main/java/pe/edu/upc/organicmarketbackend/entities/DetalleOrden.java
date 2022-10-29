package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "DetalleOrden")
public class DetalleOrden {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrden;
    @Column(name = "idProducto",length = 35)
    private int idProducto;
    @Column(name = "nameProducto",length = 50,nullable = false)
    private String nameProducto;

    public DetalleOrden() {
    }

    public DetalleOrden(int idProducto, String nameProducto) {
        this.idProducto = idProducto;
        this.nameProducto = nameProducto;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNameProducto() {
        return nameProducto;
    }

    public void setNameProducto(String nameProducto) {
        this.nameProducto = nameProducto;
    }



}

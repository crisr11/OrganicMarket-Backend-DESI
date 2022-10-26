package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;

import java.util.List;

public interface iDetalleOrdenService {

    public void insert(DetalleOrden DetalleOrden);

    List<DetalleOrden>list();

    public void delete(int idOrden);

    List<DetalleOrden>search(String nameProducto);

}

package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;

import java.util.List;
import java.util.Optional;

public interface iDetalleOrdenService {

    public boolean insert(DetalleOrden DetalleOrden);

    List<DetalleOrden>list();

    public void delete(int idOrden);

    List<DetalleOrden>search(String nameProducto);

    Optional<DetalleOrden>ListariD(int idOrden);

}

package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Orden;


import java.util.List;

public interface IOrdenService {

    public void insert (Orden orden);

    List<Orden> list();

    public void delete(int idOrden);

    List<Orden>search(int idOrden);

}

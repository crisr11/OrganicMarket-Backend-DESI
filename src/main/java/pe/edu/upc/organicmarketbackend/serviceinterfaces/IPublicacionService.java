package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Publicacion;

import java.util.List;

public interface IPublicacionService {
    void insert(Publicacion publicacion);
    List<Publicacion> list();
}

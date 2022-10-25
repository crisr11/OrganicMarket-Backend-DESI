package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Publicacion;

import java.util.List;

public interface IPublicacionService {
    public void insert(Publicacion publicacion);
    List<Publicacion> list();
    public void delete(int idPublicacion);
    List<Publicacion>search(String contenido);
}

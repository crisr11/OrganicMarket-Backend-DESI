package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.entities.ResultadoPublicacion;

import java.util.List;
import java.util.Optional;

public interface IPublicacionService {
    public boolean insertar(Publicacion publicacion);
    public void eliminar(int idPublicacion);
    Optional<Publicacion>listarId(int idPublicacion);
    List<Publicacion> listar();
    List<Publicacion>buscarPorContenido(String contenido);
    List<ResultadoPublicacion> publicacionesPorAgricultor();
}

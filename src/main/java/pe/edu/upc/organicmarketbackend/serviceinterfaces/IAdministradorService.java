package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Administrador;
import java.util.List;
import java.util.Optional;

public interface IAdministradorService {
    public boolean insert (Administrador administrador);
    List<Administrador>listar();
    public void eliminar(int idAdministrador);
    Optional<Administrador>listarId(int idAdministrador);
    List<Administrador>buscarPersona(String nombrePersona);
}

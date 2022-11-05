package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Administrador;
import java.util.List;

public interface IAdministradorService {
    public void insert (Administrador administrador);
    List<Administrador>list();
}

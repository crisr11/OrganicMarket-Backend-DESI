package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Promocion;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPromocionService {
    public boolean insertar(Promocion promocion);
    public void eliminar(int idPromocion);
    Optional<Promocion> listarId(int idPromocion);
    List<Promocion> listar();
    List<Promocion>findByFechaInicio(Date fechaInicio);
    List<Promocion>findByFechaFin(Date fechaFin);

}

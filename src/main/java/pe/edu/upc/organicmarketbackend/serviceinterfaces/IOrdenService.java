package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Orden;
import pe.edu.upc.organicmarketbackend.entities.ResultadoOrden;


import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IOrdenService {

    public void insert (Orden orden);

    List<Orden> list();

    public void delete(int idOrden);

    Optional<Orden> listarId(int idOrden);

    List<Orden>findByFechaCompra(Date fechaCompra);

    List<Orden>finByFechaEntrega(Date fechaEntrega);

    List<Orden>finByFechaEnvio(Date fechaEnvio);

    List<Orden>buscarFechaCompra();

}

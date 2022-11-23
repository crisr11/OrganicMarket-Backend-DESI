package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Promocion;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.entities.Resultado;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPromocionService {
    public boolean insertar(Promocion promocion);
    public void eliminar(int idPromocion);
    Optional<Promocion> listarId(int idPromocion);
    List<Promocion> listar();
    List<Promocion>buscarPorProducto(String producto);

    List<Promocion>vencenEstaSemana();

    List<Resultado>promoNavidad();

}

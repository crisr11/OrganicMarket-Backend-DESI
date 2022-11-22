package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public void insert (Producto producto);

    List<Producto>list();

    public void delete(int idProducto);

    List<Producto>search(String idOrden);

    Optional<Producto> listID(int idProducto);

    List<Producto> expensiveProduct();
}



package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Producto;

import java.util.List;

public interface IProductoService {

    public void insert (Producto producto);

    List<Producto>list();

    public void delete(int idProducto);

    List<Producto>search(String idOrden);
}



package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Producto;
import pe.edu.upc.organicmarketbackend.repositories.IProductoRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository proR;
    @Override
    public void insert(Producto producto) {proR.save(producto);}
    @Override
    public List<Producto> list() {return proR.findAll();}
    @Override
    public void delete(int idProducto) {proR.deleteById(idProducto);}
    @Override
    public List<Producto> search(String nameProducto) {return proR.buscarNombre(nameProducto);}

    @Override
    public Optional<Producto> listID(int idProducto) {
        return proR.findById(idProducto);
    }

    @Override
    public List<Producto> expensiveProduct() {
        return proR.expensiveProduct();
    }
}

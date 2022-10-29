package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;
import pe.edu.upc.organicmarketbackend.repositories.iDetalleOrdenRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iDetalleOrdenService;

import java.util.List;

@Service
public class DetalleOrdenServiceImpl implements iDetalleOrdenService {
    @Autowired
    private iDetalleOrdenRepository dR;
    @Override
    public void insert(DetalleOrden DetalleOrden) {
        dR.save(DetalleOrden);
    }

    @Override
    public List<DetalleOrden> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idOrden) {
        dR.deleteById(idOrden);
    }

    @Override
    public List<DetalleOrden> search(String nameProducto) {
        return dR.buscarNombre(nameProducto);
    }


}

package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Orden;
import pe.edu.upc.organicmarketbackend.repositories.IOrdenRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IOrdenService;

import java.util.List;
@Service
public class OrdenServiceImpl implements IOrdenService {
    @Autowired
    private IOrdenRepository pR;

    @Override
    public void insert(Orden orden) { pR.save(orden);}

    @Override
    public List<Orden> list() {return pR.findAll();}

    @Override
    public void delete(int idOrden) {pR.deleteById(idOrden);}

    @Override
    public List<Orden> search(int idOrden) {return pR.idOrden (idOrden);}
}

package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.repositories.IPublicacionRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPublicacionService;

import java.util.List;

@Service
public class PublicacionServiceImpl implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pR;

    @Override
    public void insert(Publicacion publicacion) {
        pR.save(publicacion);
    }

    @Override
    public List<Publicacion> list() {
        return pR.findAll();
    }
}

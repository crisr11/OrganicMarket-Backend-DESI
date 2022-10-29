package pe.edu.upc.organicmarketbackend.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import pe.edu.upc.organicmarketbackend.repositories.iAgricultorRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iAgricultorService;

import java.util.List;
import java.util.Optional;

@Service
public class AgricultorServiceImpl implements iAgricultorService {
    @Autowired
    private iAgricultorRepository aR;
    @Override
    public void insert(Agricultor Agricultor) {
        aR.save(Agricultor);
    }

    @Override
    public List<Agricultor> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAgricultor) {
            aR.deleteById(idAgricultor);
    }

    @Override
    public List<Agricultor> search(String direccionAgricultor) {
        return aR.buscarNombre(direccionAgricultor);
    }

    @Override
    public Optional<Agricultor> listarId(int idAgricultor) {
        return aR.findById(idAgricultor);
    }
}





package pe.edu.upc.organicmarketbackend.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import pe.edu.upc.organicmarketbackend.repositories.iAgricultorRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iAgricultorService;

import java.util.List;

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
}





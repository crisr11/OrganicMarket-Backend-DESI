package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upc.organicmarketbackend.entities.Mayorista;
import pe.edu.upc.organicmarketbackend.repositories.IMayoristaRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IMayoristaService;

import java.util.List;

public class MayoristaServiceImpl implements IMayoristaService {
    @Autowired
    private IMayoristaRepository mRepo;
    @Override
    public void insert(Mayorista mayorista) {
        mRepo.save(mayorista);
    }

    @Override
    public List<Mayorista> list() {
        return mRepo.findAll();
    }
}

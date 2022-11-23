package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Mayorista;
import pe.edu.upc.organicmarketbackend.repositories.IMayoristaRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IMayoristaService;

import java.util.List;
import java.util.Optional;

@Service
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

    @Override
    public void delete(int idMayorista) {
        mRepo.deleteById(idMayorista);
    }

    @Override
    public List<Mayorista> search(String ruc) {
        return mRepo.searchByRUC(ruc);
    }

    @Override
    public Optional<Mayorista> listID(int idMayorista) {
        return mRepo.findById(idMayorista);
    }
}

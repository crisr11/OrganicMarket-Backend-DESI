package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Tipo;
import pe.edu.upc.organicmarketbackend.repositories.ITipoRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.ITipoService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoServiceImpl implements ITipoService {

    @Autowired
    private ITipoRepository tR;

    @Override
    public boolean insert(Tipo tipo) {
        Tipo objTipo = tR.save(tipo);
        if(objTipo == null){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public List<Tipo> list() {
        return tR.findAll();
    }

    @Override
    public Optional<Tipo> listID(int idTipo) {
        return tR.findById(idTipo);
    }

    @Override
    public void delete(int idTipo) {
        tR.deleteById(idTipo);
    }

    @Override
    public List<Tipo> search(String nameTipo) {
        return tR.searchByName(nameTipo);
    }
}

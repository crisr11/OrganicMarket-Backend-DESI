package pe.edu.upc.organicmarketbackend.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import pe.edu.upc.organicmarketbackend.entities.ResultadoAgricultor;
import pe.edu.upc.organicmarketbackend.repositories.iAgricultorRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iAgricultorService;

import java.util.ArrayList;
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

    @Override
    public List<Agricultor> buscardireccion(String direccionAgricultor) {
        return aR.findByDireccionAgricultor(direccionAgricultor);
    }

    @Override
    public List<Agricultor> buscarmiraflores() {
        return aR.buscarmiraflores();
    }

    @Override
    public List<ResultadoAgricultor> listardatos() {
        List<ResultadoAgricultor> lista=new ArrayList<>();
        aR.listardatos().forEach(y->{
            ResultadoAgricultor re=  new ResultadoAgricultor();
            re.setPersona(y[0]);
            re.setDireccion(y[1]);
            re.setTelefono(y[2]);
            lista.add(re);
        });

        return lista;
    }


}





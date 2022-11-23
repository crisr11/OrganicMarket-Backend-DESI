package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.entities.ResultadoPublicacion;
import pe.edu.upc.organicmarketbackend.repositories.IPublicacionRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPublicacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PublicacionServiceImpl implements IPublicacionService {
    @Autowired
    private IPublicacionRepository pR;

    @Override
    @Transactional
    public boolean insertar(Publicacion p) {
        Publicacion obj = pR.save(p);
        if (obj == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idP) {
        pR.deleteById(idP);
    }

    @Override
    public Optional<Publicacion> listarId(int idP) {
        return pR.findById(idP);
    }

    @Override
    public List<Publicacion> listar() {
        return pR.findAll();
    }

    @Override
    public List<Publicacion> buscarPorContenido(String contenido) {
        return pR.buscarContenido(contenido);
    }

    @Override
    public List<ResultadoPublicacion> publicacionesPorAgricultor() {
        List<ResultadoPublicacion> lista = new ArrayList<>();
        pR.publicacionesPorAgricultor().forEach(y -> {
            ResultadoPublicacion re = new ResultadoPublicacion();
            re.setAgricultor (y[0]);
            re.setCorreo (y[1]);
            re.setTelefono (y[2]);
            re.setNpublicaciones (y[3]);
            lista.add(re);
        });

        return lista;
    }
}

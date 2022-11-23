package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Persona;
import pe.edu.upc.organicmarketbackend.entities.ReporteAgriOrden;
import pe.edu.upc.organicmarketbackend.entities.ReportePersona1;
import pe.edu.upc.organicmarketbackend.entities.ReportePersona2;
import pe.edu.upc.organicmarketbackend.repositories.IPersonaRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPersonaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaRepository pR;
    @Override
    public void insert(Persona persona) {
        pR.save(persona);
    }

    @Override
    public List<Persona> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPersona) {
        pR.deleteById(idPersona);
    }

    @Override
    public List<Persona> search(String nombrePersona) {
        return pR.buscar(nombrePersona);
    }

    @Override
    public Optional<Persona> listarId(int idPersona) {
        return pR.findById(idPersona);
    }

    @Override
    public List<ReportePersona1> buscarDniOrdenASC() {
        List<ReportePersona1>lista=new ArrayList<>();
        pR.buscarDniOrdenASC().forEach(data->{
            ReportePersona1 rp1=new ReportePersona1();
            rp1.setDniPersona(data[0]);
            rp1.setNombrePersona(data[1]);
            rp1.setCorreoPersona(data[2]);
            lista.add(rp1);
        });
        return lista;
    }

    @Override
    public List<ReportePersona2> buscarDniOrdenDESC() {
        List<ReportePersona2>lista=new ArrayList<>();
        pR.buscarDniOrdenDESC().forEach(data->{
            ReportePersona2 rp2=new ReportePersona2();
            rp2.setDniPersona(data[0]);
            rp2.setNombrePersona(data[1]);
            rp2.setCorreoPersona(data[2]);
            lista.add(rp2);
        });
        return lista;
    }

    @Override
    public List<ReporteAgriOrden> buscarCompras() {
        List<ReporteAgriOrden>lista=new ArrayList<>();
        pR.buscarCompras().forEach(data->{
            ReporteAgriOrden rao=new ReporteAgriOrden();
            rao.setNombrePersona(data[0]);
            rao.setDireccionAgricultor(data[1]);
            rao.setFechaCompra(data[2]);
            lista.add(rao);
        });
        return lista;
    }
}


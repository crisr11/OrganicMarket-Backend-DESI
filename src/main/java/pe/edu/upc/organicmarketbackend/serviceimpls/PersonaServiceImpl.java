package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Persona;
import pe.edu.upc.organicmarketbackend.repositories.IPersonaRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPersonaService;

import java.util.List;

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
        return pR.buscarNombre(nombrePersona);
    }
}

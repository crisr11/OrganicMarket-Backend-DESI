package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public void insert(Persona persona);
    List<Persona>list();
    public void delete (int idPersona);
    List<Persona>search(String nombrePersona);
    public Optional<Persona>listarId(int idPersona);
}

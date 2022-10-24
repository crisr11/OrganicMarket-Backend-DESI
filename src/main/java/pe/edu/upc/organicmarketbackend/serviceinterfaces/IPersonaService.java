package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Persona;

import java.util.List;

public interface IPersonaService {
    public void insert(Persona persona);
    List<Persona>list();
}

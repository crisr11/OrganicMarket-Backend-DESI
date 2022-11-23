package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Persona;
import pe.edu.upc.organicmarketbackend.entities.ReporteAgriOrden;
import pe.edu.upc.organicmarketbackend.entities.ReportePersona1;
import pe.edu.upc.organicmarketbackend.entities.ReportePersona2;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public void insert(Persona persona);
    List<Persona>list();
    public void delete (int idPersona);
    List<Persona>search(String nombrePersona);
    public Optional<Persona>listarId(int idPersona);
    List<ReportePersona1>buscarDniOrdenASC();
    List<ReportePersona2>buscarDniOrdenDESC();
    List<ReporteAgriOrden>buscarCompras();

}

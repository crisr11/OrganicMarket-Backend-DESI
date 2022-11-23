package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import pe.edu.upc.organicmarketbackend.entities.Mayorista;


import java.util.List;
import java.util.Optional;

public interface IMayoristaService {
    public void insert(Mayorista mayorista);
    List<Mayorista>list();
    public void delete(int idMayorista);
    List<Mayorista>search(String rucmayorista);

    Optional<Mayorista> listID(int idMayorista);
}

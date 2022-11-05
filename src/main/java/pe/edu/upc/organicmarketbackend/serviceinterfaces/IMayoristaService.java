package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Mayorista;


import java.util.List;

public interface IMayoristaService {
    public void insert(Mayorista mayorista);
    List<Mayorista>list();
    public void delete(int idMayorista);
    List<Mayorista>search(String name);
}

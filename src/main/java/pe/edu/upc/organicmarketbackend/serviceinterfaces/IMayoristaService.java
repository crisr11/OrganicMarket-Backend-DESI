package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Mayorista;


import java.util.List;

@Service
public interface IMayoristaService {
    public void insert(Mayorista mayorista);
    List<Mayorista>list();
}

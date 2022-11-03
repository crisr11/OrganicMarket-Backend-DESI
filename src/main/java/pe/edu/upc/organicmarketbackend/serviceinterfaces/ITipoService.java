package pe.edu.upc.organicmarketbackend.serviceinterfaces;

import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Tipo;

import java.util.List;
import java.util.Optional;


public interface ITipoService {

    public boolean insert (Tipo tipo);

    List<Tipo> list();

    Optional<Tipo> listID(int idTipo);

    public void delete(int idTipo);

    List<Tipo>search(String nameTipo);
}

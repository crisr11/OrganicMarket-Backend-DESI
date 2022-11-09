package pe.edu.upc.organicmarketbackend.serviceinterfaces;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import java.util.List;
import java.util.Optional;

public interface iAgricultorService {
    public void insert(Agricultor Agricultor);
    List<Agricultor>list();
    public void delete(int idAgricultor);

    List<Agricultor> search(String direccionAgricultor);

    public Optional<Agricultor> listarId(int idAgricultor);
    //primero el interface, luego el service implemtent y finalmente ir al controller, en caso de buscar ir primero al repositorio
}







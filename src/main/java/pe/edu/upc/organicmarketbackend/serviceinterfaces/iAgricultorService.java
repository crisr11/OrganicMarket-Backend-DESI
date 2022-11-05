package pe.edu.upc.organicmarketbackend.serviceinterfaces;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import java.util.List;
public interface iAgricultorService {
    public void insert(Agricultor Agricultor);
    List<Agricultor>list();
    public void delete(int idAgricultor);

    List<Agricultor> search(String direccionAgricultor);
    //primero el interface, luego el service implemtent y finalmente ir alcontroller, en caso de buscar ir primero al repositorio
}







package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Administrador;
import pe.edu.upc.organicmarketbackend.repositories.IAdministradorRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IAdministradorService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AdministradorServiceImpl implements IAdministradorService {
    @Autowired
    private IAdministradorRepository adminR;
    @Override
    @Transactional
    public boolean insert(Administrador administrador) {
        Administrador objAdmin=adminR.save(administrador);
        if(objAdmin==null)
        {
            return false;
        }else{
            return true;
        }
    }

    @Override

    public List<Administrador> listar() {
        return adminR.findAll();
    }

    @Override
    public void eliminar(int idAdministrador) {
        adminR.deleteById(idAdministrador);
    }

    @Override
    public Optional<Administrador> listarId(int idAdministrador) {
        return adminR.findById(idAdministrador);
    }

    @Override
    public List<Administrador> buscarPersona(String nombrePersona) {
        return adminR.buscarPersona(nombrePersona);
    }


}

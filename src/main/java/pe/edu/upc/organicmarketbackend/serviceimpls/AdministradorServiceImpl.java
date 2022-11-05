package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Administrador;
import pe.edu.upc.organicmarketbackend.repositories.IAdministradorRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IAdministradorService;

import java.util.List;

@Service
public class AdministradorServiceImpl implements IAdministradorService {
    @Autowired
    private IAdministradorRepository adminR;
    @Override
    public void insert(Administrador administrador) {
        adminR.save(administrador);
    }

    @Override
    public List<Administrador> list() {
        return adminR.findAll();
    }
}

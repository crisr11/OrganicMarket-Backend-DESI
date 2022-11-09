package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.organicmarketbackend.entities.Promocion;
import pe.edu.upc.organicmarketbackend.repositories.IPromocionRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPromocionService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PromocionServiceImpl implements IPromocionService {
    @Autowired
    private IPromocionRepository promoR;

    @Override
    @Transactional
    public boolean insertar(Promocion p) {
        Promocion obj = promoR.save(p);
        if (obj == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idP) {
        promoR.deleteById(idP);
    }

    @Override
    public Optional<Promocion> listarId(int idP) {
        return promoR.findById(idP);
    }

    @Override
    public List<Promocion> listar() {
        return promoR.findAll();
    }

    @Override
    public List<Promocion> findByFechaInicio(Date fechaInicio) {
        return promoR.findByFechaInicio(fechaInicio);
    }

    @Override
    public List<Promocion> findByFechaFin(Date fechaFin) {
        return promoR.findByFechaFin(fechaFin);
    }

}

package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;
import pe.edu.upc.organicmarketbackend.entities.ResultadoDetalleOrden;
import pe.edu.upc.organicmarketbackend.repositories.iDetalleOrdenRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iDetalleOrdenService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DetalleOrdenServiceImpl implements iDetalleOrdenService {
    @Autowired
    private iDetalleOrdenRepository dR;

    @Override
    @Transactional
    public boolean insert(DetalleOrden detalleOrden) {
        DetalleOrden objdetalle=dR.save(detalleOrden);
        if(objdetalle==null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<DetalleOrden> list() {
        return dR.findAll();
    }

    @Override
    @Transactional
    public void delete(int idOrden) {
        dR.deleteById(idOrden);
    }

    @Override
    public List<DetalleOrden> search(String nameProducto) {
        return dR.buscarNombre(nameProducto);
    }

    @Override
    public Optional<DetalleOrden> ListariD(int idOrden) {
        return dR.findById(idOrden);
    }

    @Override
    public List<DetalleOrden> buscarpapa() {
        return dR.buscarpapa();
    }

    @Override
    public List<ResultadoDetalleOrden> listarproductos() {
        List<ResultadoDetalleOrden> lista=new ArrayList<>();
        dR.listarcantidad().forEach(y->{
            ResultadoDetalleOrden dO=new ResultadoDetalleOrden();
            dO.setProducto(y[0]);
            dO.setCantidad(y[1]);
            lista.add(dO);
        });
        return lista;
    }


}

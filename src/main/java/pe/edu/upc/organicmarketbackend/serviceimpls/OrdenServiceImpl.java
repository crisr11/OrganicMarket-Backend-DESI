package pe.edu.upc.organicmarketbackend.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.organicmarketbackend.entities.Orden;
import pe.edu.upc.organicmarketbackend.entities.ResultadoOrden;
import pe.edu.upc.organicmarketbackend.repositories.IOrdenRepository;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IOrdenService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements IOrdenService {
    @Autowired
    private IOrdenRepository pR;

    @Override
    public void insert(Orden orden) { pR.save(orden);}

    @Override
    public List<Orden> list() {return pR.findAll();}

    @Override
    public void delete(int idOrden) {pR.deleteById(idOrden);}

    @Override
    public Optional<Orden> listarId(int idOrden) {return pR.findById(idOrden);}

    public List<Orden> findByFechaCompra(Date fechaCompra){ return pR.findByFechaCompra(fechaCompra);}

    @Override
    public List<Orden> finByFechaEntrega(Date fechaEntrega) {return pR.findByFechaEntrega(fechaEntrega);}

    @Override
    public List<Orden> finByFechaEnvio(Date fechaEnvio) {return pR.findByFechaEnvio(fechaEnvio);}

    @Override
    public List<Orden> buscarFechaCompra() {return pR.buscarFechaCompra();}

    @Override
    public List<ResultadoOrden> buscarCantidadOrdenAgricultor() {return buscarCantidadOrdenAgricultor();}


}

package pe.edu.upc.organicmarketbackend.controllers;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;
import pe.edu.upc.organicmarketbackend.entities.ResultadoDetalleOrden;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iDetalleOrdenService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalleorden")
public class DetalleOrdenController {
    @Autowired
    private iDetalleOrdenService dService;

    @PostMapping
    public void registrar(@RequestBody DetalleOrden d){
        dService.insert(d);
    }

    @GetMapping
    public List<DetalleOrden> listar(){
        return dService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dService.delete(id);
    }

    @PutMapping
    public void actualizar(@RequestBody DetalleOrden d){
        dService.insert(d);
    }

    @PostMapping("/buscar")
    public List<DetalleOrden> buscar(@RequestBody DetalleOrden d) throws ParseException {
        List<DetalleOrden> listaDetalle;
       listaDetalle=dService.search(d.getProducto().getNameProducto());
       return listaDetalle;}

    @GetMapping("/{id}")
    public Optional<DetalleOrden>ListarId(@PathVariable("id") Integer id){
        return dService.ListariD(id);
    }
    @GetMapping("/buscarpapas")
    public List<DetalleOrden> buscarpapa(){
        return dService.buscarpapa();
    }
    @GetMapping("/productoscantidad")
    public List<ResultadoDetalleOrden> listarproductos(){
        return dService.listarproductos();
    }

}

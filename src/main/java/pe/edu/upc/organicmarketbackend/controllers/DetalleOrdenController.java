package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iDetalleOrdenService;

import java.util.List;

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
    public List<DetalleOrden> buscar(@RequestBody DetalleOrden d){
        return dService.search(d.getNameProducto());
    }

}

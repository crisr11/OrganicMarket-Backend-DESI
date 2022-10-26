package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Producto;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IProductoService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService pService;

    @PostMapping
    public void registrar(@RequestBody Producto p) {
        pService.insert(p);
    }

    @GetMapping
    public List<Producto> listar() {
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);
    }

    @PutMapping
    public void actualizar(@RequestBody Producto p)  {
        pService.insert(p);
    }

    @PostMapping("/buscar")
    public List<Producto> buscar(@RequestBody Producto p){
        return pService.search(p.getNameProducto());
    }


}

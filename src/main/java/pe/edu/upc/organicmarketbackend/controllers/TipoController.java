package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Tipo;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.ITipoService;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TipoController {
    @Autowired
    private ITipoService tService;

    @PostMapping
    public void register(@RequestBody Tipo t){
        tService.insert(t);
    }
    @GetMapping
    public List<Tipo> listar(){
        return tService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        tService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Tipo t){
        tService.insert(t);
    }
    @PostMapping("/buscar")
    public List<Tipo> buscar(@RequestBody Tipo t){
        return tService.search(t.getNameTipo());
    }
}

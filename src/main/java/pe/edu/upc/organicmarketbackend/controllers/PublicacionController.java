package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPublicacionService;

import java.util.List;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {
    @Autowired
    private IPublicacionService pService;
    @PostMapping
    public void registrar(@RequestBody Publicacion p){pService.insert(p);}
    @GetMapping
    public List<Publicacion>listar(){return pService.list();}
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){pService.delete(id);}
    @PutMapping
    public void actualizar (@RequestBody Publicacion p){pService.insert(p);}
    @PostMapping("/buscar")
    public List<Publicacion>buscar (@RequestBody Publicacion p){return pService.search(p.getContenido());}
}

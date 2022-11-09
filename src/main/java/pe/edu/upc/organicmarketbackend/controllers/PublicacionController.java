package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPublicacionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {
    @Autowired
    private IPublicacionService pService;
    @PostMapping
    public void registrar(@RequestBody Publicacion p){pService.insertar(p);}
    @PutMapping
    public void modificar (@RequestBody Publicacion p){pService.insertar(p);}
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){pService.eliminar(id);}
    @GetMapping
    public List<Publicacion>listar(){return pService.listar();}
    @PostMapping("/buscar")
    public List<Publicacion>buscar (@RequestBody String contenido) throws ParseException {
        List<Publicacion> listaPublicaciones;
        listaPublicaciones = pService.buscarPorContenido(contenido);
        return listaPublicaciones;
    }
    @GetMapping("/{id}")
    public Optional<Publicacion> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
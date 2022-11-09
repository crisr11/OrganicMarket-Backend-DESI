package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Persona;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPersonaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private IPersonaService pService;
    @PostMapping
    public void registrar (@RequestBody Persona persona){
        pService.insert(persona);
    }
    @GetMapping
    public List<Persona>listar(){
        return pService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Persona p){
        pService.insert(p);
    }
    @PostMapping("/buscar")
    public List<Persona>buscar(@RequestBody Persona p){
        return pService.search(p.getNombrePersona());
    }

    @GetMapping("/{id}")
    public Optional<Persona> listarId(@PathVariable("id")Integer id){return pService.listarId(id);}

}


































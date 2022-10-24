package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Persona;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPersonaService;

import java.util.List;

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

}


































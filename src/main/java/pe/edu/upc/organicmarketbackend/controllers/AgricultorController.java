package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iAgricultorService;

import java.util.List;
@RestController
@RequestMapping("/agricultores")
public class AgricultorController {
    @Autowired
    private iAgricultorService aService;

    @PostMapping
    public void registrar(@RequestBody Agricultor p) {
        aService.insert(p);
    }
    @GetMapping
    public List<Agricultor> listar() {
        return aService.list();
    }
}


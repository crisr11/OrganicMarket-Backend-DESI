package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.iAgricultorService;

import java.util.List;
import java.util.Optional;

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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        aService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody  Agricultor a) {
        aService.insert(a);
    }

    @PostMapping("/buscar")
    public List<Agricultor> buscar(@RequestBody Agricultor a)
    {
        return aService.search(a.getDireccionAgricultor());
    }

    @GetMapping("/{id}")
    public Optional<Agricultor> listarId(@PathVariable("id") Integer id) {
        return aService.listarId(id);
    }
}


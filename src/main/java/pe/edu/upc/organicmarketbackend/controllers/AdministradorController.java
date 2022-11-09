package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Administrador;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IAdministradorService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {
    @Autowired
    private IAdministradorService adminService;

    @PostMapping
    public void insertar(@RequestBody Administrador admin){adminService.insert(admin);}

    @PutMapping
    public void modificar(@RequestBody Administrador admin){adminService.insert(admin);}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){adminService.eliminar(id);}

    @GetMapping
    public List<Administrador> listar(){return adminService.listar();}

    @PostMapping("/buscar")
    public List<Administrador>buscar(@RequestBody Administrador admin)throws ParseException{
        List<Administrador>listaAdministrador;
        listaAdministrador=adminService.buscarPersona(admin.getPersona().getNombrePersona());
        return listaAdministrador;
    }
    @GetMapping("/{id}")
    public Optional<Administrador> listarId(@PathVariable("id")Integer id){return adminService.listarId(id);}

}

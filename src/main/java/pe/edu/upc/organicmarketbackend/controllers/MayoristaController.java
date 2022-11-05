package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Mayorista;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IMayoristaService;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IMayoristaService;

import java.util.List;

@RestController
@RequestMapping("/mayoristas")
public class MayoristaController {
    @Autowired
    private IMayoristaService mService;

    @PostMapping
    public void registrar(@RequestBody Mayorista m) {
        mService.insert(m);
    }
    @GetMapping
    public List<Mayorista> listar() {
        return mService.list();
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        mService.delete(id);
    }
    @PutMapping
    public void actualizar(@RequestBody Mayorista m)  {
        mService.insert(m);
    }
    @PostMapping("/buscar")
    public List<Mayorista> buscar(@RequestBody Mayorista m){
        return mService.search(m.getNameMayorista());
    }
}

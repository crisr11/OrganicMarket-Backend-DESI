package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Promocion;
import pe.edu.upc.organicmarketbackend.serviceinterfaces.IPromocionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promociones")
public class PromocionController {
    @Autowired
    private IPromocionService promoService;
    @PostMapping
    public void registrar(@RequestBody Promocion p){promoService.insertar(p);}
    @PutMapping
    public void modificar (@RequestBody Promocion p){promoService.insertar(p);}
    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){promoService.eliminar(id);}
    @GetMapping
    public List<Promocion> listar(){return promoService.listar();}
    /*
    @PostMapping("/buscarFechaInicio")
   public List<Promocion>buscarPorFechaInicio (@RequestBody Promocion p) {
       //return promoService.buscarPorFechaInicio(p.getFechaInicio());
       return null;
   }
  PostMapping("/buscarFechaFin")
   public List<Promocion>buscarPorFechaFin (@RequestBody Promocion p) {
       //return promoService.buscarPorFechaFin(p.getFechaFin());
       return null;
   }*/
    @GetMapping("/{id}")
    public Optional<Promocion> listarId(@PathVariable("id") Integer id) {
        return promoService.listarId(id);
    }
}
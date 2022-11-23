package pe.edu.upc.organicmarketbackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.organicmarketbackend.entities.Promocion;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;
import pe.edu.upc.organicmarketbackend.entities.Resultado;
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
    @GetMapping("/{id}")
    public Optional<Promocion> listarId(@PathVariable("id") Integer id) {
        return promoService.listarId(id);
    }
    @PostMapping("/buscar")
    public List<Promocion>buscar (@RequestBody String producto) throws ParseException {
        List<Promocion> lista;
        lista = promoService.buscarPorProducto(producto);
        return lista;
    }
    @GetMapping("/proximosvencimientos")
    public List<Promocion> vencenEstaSemana(){
        return promoService.vencenEstaSemana();
    }

    @GetMapping("/promonavidad")
    public List<Resultado> promoNavidad(){
        return promoService.promoNavidad();
    }
}
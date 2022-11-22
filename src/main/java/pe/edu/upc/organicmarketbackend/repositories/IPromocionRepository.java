package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Producto;
import pe.edu.upc.organicmarketbackend.entities.Promocion;

import java.util.Date;
import java.util.List;

@Repository
public interface IPromocionRepository extends JpaRepository<Promocion, Integer> {
    List<Promocion> findByFechaInicio(Date fechaInicio);
    List<Promocion> findByFechaFin(Date fechaFin);

    @Query(value = "select pro.name_producto,p.fecha_inicio,p.fecha_fin from agricultor a INNER JOIN promocion p ON a.id_agricultor = p.id_agricultor INNER JOIN producto pro ON pro.id_producto = p.id_producto where p.fecha_inicio > '2022-12-15' and p.fecha_fin < '2023-01-10'" , nativeQuery = true)
    List<String[]> promNavidad();
}

package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Producto;
import pe.edu.upc.organicmarketbackend.entities.Promocion;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;

import java.util.Date;
import java.util.List;

@Repository
public interface IPromocionRepository extends JpaRepository<Promocion, Integer> {
    @Query("from Promocion p join Producto r on p.producto.idProducto=r.idProducto where r.nameProducto like %:producto%")
    List<Promocion> buscarProducto(@Param("producto") String producto);

    @Query(value ="SELECT * FROM promocion p where p.fecha_fin > CURRENT_DATE - interval '1' day and p.fecha_fin < CURRENT_DATE + interval '8' day ORDER BY p.fecha_fin ASC" ,nativeQuery = true)
    List<Promocion> vencenproximos7dias();
    @Query(value = "select pro.name_producto,p.fecha_inicio,p.fecha_fin from agricultor a INNER JOIN promocion p ON a.id_agricultor = p.id_agricultor INNER JOIN producto pro ON pro.id_producto = p.id_producto where p.fecha_inicio > '2022-12-15' and p.fecha_fin < '2023-01-10'" , nativeQuery = true)
    List<String[]> promNavidad();
}

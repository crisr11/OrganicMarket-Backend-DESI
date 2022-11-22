package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Producto;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    @Query("from Producto p where p.nameProducto like %:nameProducto%")
    List<Producto> buscarNombre(@Param("nameProducto") String nameProducto);

    @Query(value = "select * from producto p where p.precio in (select max(precio) from producto)" , nativeQuery = true)
    List<Producto> expensiveProduct();
}

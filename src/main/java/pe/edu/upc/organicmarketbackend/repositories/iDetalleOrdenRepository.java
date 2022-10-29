package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.DetalleOrden;

import java.util.List;

@Repository
public interface iDetalleOrdenRepository extends JpaRepository<DetalleOrden,Integer> {

    @Query("from DetalleOrden d where upper(d.nameProducto) like %:nameProducto% or lower(d.nameProducto)"+
    "like %:nameProducto% or d.nameProducto like %:nameProducto%")
    List<DetalleOrden> buscarNombre(@Param("nameProducto")String nameProducto);
}
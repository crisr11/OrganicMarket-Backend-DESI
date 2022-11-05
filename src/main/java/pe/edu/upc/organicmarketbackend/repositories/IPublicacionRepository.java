package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;

import java.util.List;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer> {
    @Query("from Publicacion p where p.contenido like %:contenido%")
    List<Publicacion> buscarContenido(@Param("contenido") String contenido);
}

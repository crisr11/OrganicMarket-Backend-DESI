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

    @Query(value ="SELECT t.nombre_persona as agricultor, t.correo_persona as correo, t.telefono_persona as telefono, count(p.id_publicacion) as npublicaciones FROM persona t INNER JOIN agricultor a ON t.id_persona = a.id_persona  FULL JOIN publicacion p  ON a.id_agricultor = p.id_agricultor GROUP BY 1,2,3 ORDER BY 4 DESC" ,nativeQuery = true)
    List<String[]> publicacionesPorAgricultor();
}

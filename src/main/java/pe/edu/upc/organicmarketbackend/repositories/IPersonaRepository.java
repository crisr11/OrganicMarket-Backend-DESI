package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Persona;

import java.util.List;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
    @Query("from Persona p where p.nombrePersona like %:nombrePersona%")
    List<Persona>buscar(@Param("nombrePersona")String nombrePersona);
    @Query(value = "SELECT p.dni_persona,p.nombre_persona,p.correo_persona from persona p ORDER by p.dni_persona asc;",nativeQuery = true)
    List<String[]>buscarDniOrdenASC();
    @Query(value = "SELECT p.dni_persona,p.nombre_persona,p.correo_persona FROM persona p ORDER BY p.dni_persona desc;",nativeQuery = true)
    List<String[]>buscarDniOrdenDESC();
    @Query(value = "SELECT p.nombre_persona,a.direccion,o.fecha_compra FROM persona p INNER JOIN agricultor a ON a.id_persona= p.id_persona INNER JOIN orden o ON o.id_agricultor= a.id_agricultor WHERE o.fecha_compra BETWEEN '2022-01-01' AND CURRENT_DATE;",nativeQuery = true)
    List<String[]>buscarCompras();
}

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
    List<Persona>buscarNombre(@Param("nombrePersona")String nombrePersona);
}

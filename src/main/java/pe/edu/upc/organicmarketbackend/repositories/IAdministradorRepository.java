package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Administrador;

import java.util.List;

@Repository
public interface IAdministradorRepository extends JpaRepository<Administrador,Integer> {
    @Query("from Administrador a where a.persona.nombrePersona like %:nombrePersona%")
    List<Administrador> buscarPersona(@Param("nombrePersona") String nombrePersona);
}

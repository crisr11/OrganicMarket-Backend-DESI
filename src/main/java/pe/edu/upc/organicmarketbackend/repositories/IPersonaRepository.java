package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Persona;
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
}

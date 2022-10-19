package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Publicacion;

@Repository
public interface IPublicacionRepository extends JpaRepository<Publicacion, Integer> {
}

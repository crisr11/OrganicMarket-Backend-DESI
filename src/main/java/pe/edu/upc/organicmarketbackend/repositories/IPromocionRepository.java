package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Promocion;

import java.util.Date;
import java.util.List;

@Repository
public interface IPromocionRepository extends JpaRepository<Promocion, Integer> {
    List<Promocion> findByFechaInicio(Date fechaInicio);
    List<Promocion> findByFechaFin(Date fechaFin);
}

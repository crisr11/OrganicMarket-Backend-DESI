package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Orden;

import java.util.Date;
import java.util.List;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

    List<Orden> findByFechaCompra(Date fechaCompra);

    List<Orden> findByFechaEnvio (Date fechaEnvio);

    List<Orden>findByFechaEntrega (Date fechaEntrega);

}

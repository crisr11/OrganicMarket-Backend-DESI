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

    @Query(value="select * from orden o where o.fechaCompra>'2022-06-01'",nativeQuery = true)
    List<Orden>buscarFechaCompra();
    @Query(value = "select p.nombre_persona, count(i.idOrden) as cantidad from Orden i inner join persona p on i.id_persona=i.id_persona group by p.name_propietario", nativeQuery = true)
    List<String[]>buscarCantidadOrdenAgricultor();


}

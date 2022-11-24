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

    @Query(value="select * from orden o where o.fecha_compra>'2022-06-01'",nativeQuery = true)
    List<Orden>buscarFechaCompra();
    @Query(value = "select p.nombre_persona as nombre, count(i.id_orden) as cantidad\n from Orden i full join Agricultor a on i.id_agricultor=a.id_agricultor\n inner join persona p on p.id_persona=a.id_persona\n group by p.nombre_persona", nativeQuery = true)
    List<String[]>buscarCantidadOrdenAgricultor();


}

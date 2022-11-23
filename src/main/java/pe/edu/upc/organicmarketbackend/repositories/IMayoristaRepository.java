package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Mayorista;

import java.util.List;


@Repository
public interface IMayoristaRepository extends JpaRepository<Mayorista,Integer> {
    @Query("SELECT m FROM Mayorista m WHERE lower(m.RUCMayorista) like lower(concat('%',:RUCMayorista,'%'))")
    List<Mayorista> searchByRUC(@Param("RUCMayorista") String RUCMayorista);
}

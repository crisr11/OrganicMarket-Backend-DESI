package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Tipo;

import java.util.List;

@Repository
public interface ITipoRepository extends JpaRepository<Tipo,Integer>{
    @Query("SELECT t FROM Tipo t WHERE lower(t.nameTipo) like lower(concat('%',:nameTipo,'%'))")
    List<Tipo> searchByName(@Param("nameTipo")String nameTipo);
}

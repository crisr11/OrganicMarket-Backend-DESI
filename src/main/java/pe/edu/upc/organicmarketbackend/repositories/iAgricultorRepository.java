package pe.edu.upc.organicmarketbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query; //Agregar
import org.springframework.data.repository.query.Param; //Agregar
import org.springframework.stereotype.Repository;
import pe.edu.upc.organicmarketbackend.entities.Agricultor;

import java.util.List;

@Repository
public interface iAgricultorRepository extends JpaRepository<Agricultor,Integer>{
    @Query("from Agricultor a where a.direccionAgricultor like %:direccionAgricultor%")
    List<Agricultor> buscarNombre(@Param("direccionAgricultor") String direccionAgricultor);

    List<Agricultor> findByDireccionAgricultor(String direccion);

    @Query(value = "select * from agricultor a where a.direccion like '%Miraflores'",nativeQuery = true)
    List<Agricultor> buscarmiraflores();



    //Control barra espaciadora despues de la t en el list
}





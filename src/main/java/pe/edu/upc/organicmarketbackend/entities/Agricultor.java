package pe.edu.upc.organicmarketbackend.entities;
import javax.persistence.*;

@Entity
@Table(name = "Agricultor")
public class Agricultor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgricultor;
    @Column(name = "direccion",length = 70,nullable = false)
    private String namePropietario;
    @Column(name = "persona_id_persona",length = 35)
    private int persona_id_persona;

    public Agricultor() {
    }

    public int getIdAgricultor() {
        return idAgricultor;
    }

    public String getNamePropietario() {
        return namePropietario;
    }

    public int getPersona_id_persona() {
        return persona_id_persona;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public void setNamePropietario(String namePropietario) {
        this.namePropietario = namePropietario;
    }

    public void setPersona_id_persona(int persona_id_persona) {
        this.persona_id_persona = persona_id_persona;
    }
}

package pe.edu.upc.organicmarketbackend.entities;
import javax.persistence.*;

@Entity
@Table(name = "Agricultor")
public class Agricultor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgricultor;
    @Column(name = "direccion",length = 70,nullable = false)
    private String direccionAgricultor;
    @ManyToOne
    @JoinColumn(name = "idPersona",nullable = false)
    private Persona persona;

    public Agricultor() {
    }

    public int getIdAgricultor() {
        return idAgricultor;
    }

    public String getDireccionAgricultor() {
        return direccionAgricultor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setIdAgricultor(int idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public void setDireccionAgricultor(String direccionAgricultor) {
        this.direccionAgricultor = direccionAgricultor;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

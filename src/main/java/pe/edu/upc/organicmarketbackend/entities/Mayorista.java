package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Mayorista")
public class Mayorista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMayorista;
    @Column(name = "RUC", length = 60,nullable = false)
    private String RUCMayorista;
    @Column(name = "Rubro", length = 60,nullable = false)
    private String rubroMayorista;

    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    public Mayorista() {
    }

    public Mayorista(int idMayorista, String RUCMayorista, String rubroMayorista, Persona persona) {
        this.idMayorista = idMayorista;
        this.RUCMayorista = RUCMayorista;
        this.rubroMayorista = rubroMayorista;
        this.persona = persona;
    }

    public int getIdMayorista() {
        return idMayorista;
    }

    public void setIdMayorista(int idMayorista) {
        this.idMayorista = idMayorista;
    }

    public String getRUCMayorista() {
        return RUCMayorista;
    }

    public void setRUCMayorista(String RUCMayorista) {
        this.RUCMayorista = RUCMayorista;
    }

    public String getRubroMayorista() {
        return rubroMayorista;
    }

    public void setRubroMayorista(String rubroMayorista) {
        this.rubroMayorista = rubroMayorista;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

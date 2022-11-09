package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name="Administrador")
public class Administrador {
    private static final long serialVerionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;
    @ManyToOne
    @JoinColumn (name="idPersona",nullable = false)
    private Persona persona;

    public Administrador() {
    }

    public Administrador(int idAdministrador, Persona persona) {
        this.idAdministrador = idAdministrador;
        this.persona = persona;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

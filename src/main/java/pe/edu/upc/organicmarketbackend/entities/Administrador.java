package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name="Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;
    @Column(name="idPersona",nullable = false)
    private int persona_id_persona;

    public Administrador() {
    }

    public Administrador(int idAdministrador, int persona_id_persona) {
        this.idAdministrador = idAdministrador;
        this.persona_id_persona = persona_id_persona;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public int getPersona_id_persona() {
        return persona_id_persona;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public void setPersona_id_persona(int persona_id_persona) {
        this.persona_id_persona = persona_id_persona;
    }
}

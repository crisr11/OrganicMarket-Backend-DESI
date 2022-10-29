package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;


@Entity
@Table(name="Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name="Nombre",length = 50,nullable = false)
    private String nombrePersona;
    @Column(name = "Dni",nullable = false)
    private int dniPersona;
    @Column(name = "Telefono",nullable = false)
    private int telefonoPersona;
    @Column(name = "Correo",nullable = false)
    private String correoPersona;

    public Persona() {
    }

    public Persona(int idPersona, String nombrePersona,
                   int dniPersona, int telefonoPersona,
                   String correoPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.dniPersona = dniPersona;
        this.telefonoPersona = telefonoPersona;
        this.correoPersona = correoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public int getDniPersona() {
        return dniPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }
}

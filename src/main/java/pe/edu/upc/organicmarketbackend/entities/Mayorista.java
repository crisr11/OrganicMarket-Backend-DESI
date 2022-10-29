package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Mayorista")
public class Mayorista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMayorista;
    @Column(name = "Nombre", length = 60,nullable = false)
    private String nameMayorista;
    @Column(name = "RUC", length = 60,nullable = false)
    private String RUCMayorista;
    @Column(name = "Rubro", length = 60,nullable = false)
    private String rubroMayorista;

    public int getIdMayorista() {
        return idMayorista;
    }

    public void setIdMayorista(int idMayorista) {
        this.idMayorista = idMayorista;
    }

    public String getNameMayorista() {
        return nameMayorista;
    }

    public void setNameMayorista(String nameMayorista) {
        this.nameMayorista = nameMayorista;
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

    public Mayorista(int idMayorista, String nameMayorista, String RUCMayorista, String rubroMayorista) {
        this.idMayorista = idMayorista;
        this.nameMayorista = nameMayorista;
        this.RUCMayorista = RUCMayorista;
        this.rubroMayorista = rubroMayorista;
    }

    public Mayorista() {
    }
}

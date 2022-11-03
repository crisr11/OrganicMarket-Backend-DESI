package pe.edu.upc.organicmarketbackend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;

    @Column(name = "nameTipo",length = 30,nullable = false)
    private String nameTipo;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNameTipo() {
        return nameTipo;
    }

    public void setNameTipo(String nameTipo) {
        this.nameTipo = nameTipo;
    }

    public Tipo(int idTipo, String nameTipo) {
        this.idTipo = idTipo;
        this.nameTipo = nameTipo;
    }
    public Tipo(){

    }
}

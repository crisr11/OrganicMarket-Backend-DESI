package pe.edu.upc.organicmarketbackend.entities;

public class ReportePersona1 {
    private String dniPersona;
    private String nombrePersona;
    private String correoPersona;

    public ReportePersona1() {
    }

    public ReportePersona1(String dniPersona, String nombrePersona, String correoPersona) {
        this.dniPersona = dniPersona;
        this.nombrePersona = nombrePersona;
        this.correoPersona = correoPersona;
    }

    public String getDniPersona() {
        return dniPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setDniPersona(String dniPersona) {
        this.dniPersona = dniPersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }
}

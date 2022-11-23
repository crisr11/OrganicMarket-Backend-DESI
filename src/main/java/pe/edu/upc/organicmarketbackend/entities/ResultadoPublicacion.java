package pe.edu.upc.organicmarketbackend.entities;

public class ResultadoPublicacion {

    private String agricultor;
    private String correo;
    private String telefono;
    private String npublicaciones;

    public ResultadoPublicacion() {
    }

    public ResultadoPublicacion(String agricultor, String correo, String telefono, String npublicaciones) {
        this.agricultor = agricultor;
        this.correo = correo;
        this.telefono = telefono;
        this.npublicaciones = npublicaciones;
    }

    public String getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(String agricultor) {
        this.agricultor = agricultor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNpublicaciones() {
        return npublicaciones;
    }

    public void setNpublicaciones(String npublicaciones) {
        this.npublicaciones = npublicaciones;
    }
}

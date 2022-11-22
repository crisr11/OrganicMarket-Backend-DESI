package pe.edu.upc.organicmarketbackend.entities;

public class ResultadoAgricultor {
    private String direccion;
    private String telefono;
    private String persona;

    public ResultadoAgricultor() {
    }
    public ResultadoAgricultor(String persona, String direccion, String telefono) {
        this.persona = persona;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }








}
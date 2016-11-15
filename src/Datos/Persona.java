package Datos;

public class Persona {

    private String persona, tipo, nombrePersona, contraseña;

    public Persona(String persona, String tipo, String nombrePersona, String contraseña) {
        this.persona = persona;
        this.tipo = tipo;
        this.nombrePersona = nombrePersona;
        this.contraseña = contraseña;
    }

    public String getPersona() {
        return persona;
    }

    public void setUsuario(String persona) {
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombrepersona() {
        return nombrePersona;
    }

    public void setNombrepersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

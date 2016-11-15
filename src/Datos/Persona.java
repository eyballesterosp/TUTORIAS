/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Persona {
     private String persona,tipo,nombrepersona,contraseña;
    

    public Persona(String persona, String tipo, String nombrepersona, String contraseña) {
        this.persona = persona;
        this.tipo = tipo;
        this.nombrepersona = nombrepersona;
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
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }  
}

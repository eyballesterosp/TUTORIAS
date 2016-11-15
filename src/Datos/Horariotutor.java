/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Horariotutor {
    public String lunes, martes,miercoles,jueves,viernes,hora;
    public long cctutor;

    public Horariotutor(String hora,String lunes, String martes, String miercoles, String jueves, String viernes, long cctutor) {
        this.hora=hora;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.cctutor = cctutor;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public long getCctutor() {
        return cctutor;
    }

    public void setCctutor(long cctutor) {
        this.cctutor = cctutor;
    }
    
    
}

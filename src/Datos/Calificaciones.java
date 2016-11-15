/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Calificaciones {
    public  long cctut,puntaje,codexam;
    public String fechaci,lugarci,nombreaspirante;

    public Calificaciones(long cctut, long puntaje, long codexam, String fechaci, String lugarci, String nombreaspirante) {
        this.cctut = cctut;
        this.puntaje = puntaje;
        this.codexam = codexam;
        this.fechaci = fechaci;
        this.lugarci = lugarci;
        this.nombreaspirante = nombreaspirante;
    }

    
    public long getCctut() {
        return cctut;
    }

    public void setCctut(long cctut) {
        this.cctut = cctut;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public long getCodexam() {
        return codexam;
    }

    public void setCodexam(long codexam) {
        this.codexam = codexam;
    }

    public String getFechaci() {
        return fechaci;
    }

    public void setFechaci(String fechaci) {
        this.fechaci = fechaci;
    }

    public String getLugarci() {
        return lugarci;
    }

    public void setLugarci(String lugarci) {
        this.lugarci = lugarci;
    }

    public String getNombreaspirante() {
        return nombreaspirante;
    }

    public void setNombreaspirante(String nombreaspirante) {
        this.nombreaspirante = nombreaspirante;
    }
    
}

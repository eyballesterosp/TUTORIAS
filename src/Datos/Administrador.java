
package Datos;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable{
     private String nombAdm,dirAdm,lugarNacAdm,corrAdm;
    private long ccAdm,telAdm,codAdm;

    public Administrador(String nombAdm, String dirAdm, String corrAdm, long ccAdm, long telAdm, long codAdm, String persona, String tipo, String nombrepersona, String contraseña) {
        super(persona, tipo, nombrepersona, contraseña);
        this.nombAdm = nombAdm;
        this.dirAdm = dirAdm;
        this.corrAdm = corrAdm;
        this.ccAdm = ccAdm;
        this.telAdm = telAdm;
        this.codAdm = codAdm;
    }

    public String getNombAdm() {
        return nombAdm;
    }

    public void setNombAdm(String nombAdm) {
        this.nombAdm = nombAdm;
    }

    public String getDirAdm() {
        return dirAdm;
    }

    public void setDirAdm(String dirAdm) {
        this.dirAdm = dirAdm;
    }

    public String getLugarNacAdm() {
        return lugarNacAdm;
    }

    public void setLugarNacAdm(String lugarNacAdm) {
        this.lugarNacAdm = lugarNacAdm;
    }

    public String getCorrAdm() {
        return corrAdm;
    }

    public void setCorrAdm(String corrAdm) {
        this.corrAdm = corrAdm;
    }

    public long getCcAdm() {
        return ccAdm;
    }

    public void setCcAdm(long ccAdm) {
        this.ccAdm = ccAdm;
    }

    public long getTelAdm() {
        return telAdm;
    }

    public void setTelAdm(long telAdm) {
        this.telAdm = telAdm;
    }

    public long getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(long codAdm) {
        this.codAdm = codAdm;
    }

}
package Datos;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable {

    private String nomEst, dirEst, corrEst, ubiEst;
    private long ccEst, telEst, edadEst, cartera;

    public Estudiante(String nomEst, String dirEst, String corrEst, String ubiEst, long ccEst, long telEst, long edadEst, long cartera, String persona, String tipo, String nombrepersona, String contraseña) {
        super(persona, tipo, nombrepersona, contraseña);
        this.nomEst = nomEst;
        this.dirEst = dirEst;
        this.corrEst = corrEst;
        this.ubiEst = ubiEst;
        this.ccEst = ccEst;
        this.telEst = telEst;
        this.edadEst = edadEst;
        this.cartera = cartera;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public String getDirEst() {
        return dirEst;
    }

    public void setDirEst(String dirEst) {
        this.dirEst = dirEst;
    }

    public String getCorrEst() {
        return corrEst;
    }

    public void setCorrEst(String corrEst) {
        this.corrEst = corrEst;
    }

    public String getUbiEst() {
        return ubiEst;
    }

    public void setUbiEst(String ubiEst) {
        this.ubiEst = ubiEst;
    }

    public long getCcEst() {
        return ccEst;
    }

    public void setCcEst(long ccEst) {
        this.ccEst = ccEst;
    }

    public long getTelEst() {
        return telEst;
    }

    public void setTelEst(long telEst) {
        this.telEst = telEst;
    }

    public long getEdadEst() {
        return edadEst;
    }

    public void setEdadEst(long edadEst) {
        this.edadEst = edadEst;
    }

    public long getCartera() {
        return cartera;
    }

    public void setCartera(long cartera) {
        this.cartera = cartera;
    }

}

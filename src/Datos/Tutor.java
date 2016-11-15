package Datos;

import java.io.Serializable;

public class Tutor extends Persona implements Serializable {

    private String nomTut, dirTut, fechaCi, lugarCi, corrTut, ubiTut, profTut;
    private long ccTut, telTut, edadTut, codExam, puntaje, cartera, numTut;

    public Tutor(String nomTut, String dirTut, String fechaCi, String lugarCi, String corrTut, String ubiTut, String profTut, long ccTut, long telTut, long edadTut, long codExam, long puntaje, long cartera, long numTut, String persona, String tipo, String nombrePersona, String contraseña) {
        super(persona, tipo, nombrePersona, contraseña);
        this.nomTut = nomTut;
        this.dirTut = dirTut;
        this.fechaCi = fechaCi;
        this.lugarCi = lugarCi;
        this.corrTut = corrTut;
        this.ubiTut = ubiTut;
        this.profTut = profTut;
        this.ccTut = ccTut;
        this.telTut = telTut;
        this.edadTut = edadTut;
        this.codExam = codExam;
        this.puntaje = puntaje;
        this.cartera = cartera;
        this.numTut = numTut;
    }

    public String getNomTut() {
        return nomTut;
    }

    public void setNomTut(String nomTut) {
        this.nomTut = nomTut;
    }

    public String getDirTut() {
        return dirTut;
    }

    public void setDirTut(String dirTut) {
        this.dirTut = dirTut;
    }

    public String getFechaCi() {
        return fechaCi;
    }

    public void setFechaCi(String fechaCi) {
        this.fechaCi = fechaCi;
    }

    public String getLugarCi() {
        return lugarCi;
    }

    public void setLugarCi(String lugarCi) {
        this.lugarCi = lugarCi;
    }

    public String getCorrTut() {
        return corrTut;
    }

    public void setCorrTut(String corrTut) {
        this.corrTut = corrTut;
    }

    public String getUbiTut() {
        return ubiTut;
    }

    public void setUbiTut(String ubiTut) {
        this.ubiTut = ubiTut;
    }

    public String getProfTut() {
        return profTut;
    }

    public void setProfTut(String profTut) {
        this.profTut = profTut;
    }

    public long getCcTut() {
        return ccTut;
    }

    public void setCcTut(long ccTut) {
        this.ccTut = ccTut;
    }

    public long getTelTut() {
        return telTut;
    }

    public void setTelTut(long telTut) {
        this.telTut = telTut;
    }

    public long getEdadTut() {
        return edadTut;
    }

    public void setEdadTut(long edadTut) {
        this.edadTut = edadTut;
    }

    public long getCodExam() {
        return codExam;
    }

    public void setCodExam(long codExam) {
        this.codExam = codExam;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public long getCartera() {
        return cartera;
    }

    public void setCartera(long cartera) {
        this.cartera = cartera;
    }

    public long getNumTut() {
        return numTut;
    }

    public void setNumTut(long numTut) {
        this.numTut = numTut;
    }

}

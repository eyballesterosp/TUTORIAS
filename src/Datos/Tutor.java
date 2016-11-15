/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;


public class Tutor extends Persona implements Serializable{
    
    private String nomtut,dirtut,fechaci,lugarci,corrtut,ubitut,proftut;
    private long cctut,teltut,edadtut,codexam,puntaje,cartera,numt;

    public Tutor(String nomtut, String dirtut, String fechaci, String lugarci, String corrtut, String ubitut,String proftut,long cartera,long numt,long codexam, long puntaje, long edadtut, long cctut, long teltut, String usuario, String tipo, String nombreusuario, String contraseña) {
        super(usuario, tipo, nombreusuario, contraseña);
       
        this.nomtut = nomtut;
        this.cartera=cartera;
        this.numt=numt;
        this.dirtut = dirtut;
        this.fechaci = fechaci;
        this.lugarci = lugarci;
        this.codexam= codexam;
        this.puntaje=puntaje;
        this.corrtut = corrtut;
        this.ubitut = ubitut;
        this.proftut=proftut;
        this.cctut = cctut;
        this.teltut = teltut;
        this.edadtut = edadtut;
     }
    public Tutor(String usuario,String tipo,String nombreusuario,String contraseña){
        super(usuario, tipo, nombreusuario, contraseña);
           }
    
    public String getNomtut() {
        return nomtut;
    }

    public String getLugarci() {
        return lugarci;
    }

    public long getCartera() {
        return cartera;
    }

    public void setCartera(long cartera) {
        this.cartera = cartera;
    }

    public long getNumt() {
        return numt;
    }

    public void setNumt(long numt) {
        this.numt = numt;
    }

    public long getCodexam() {
        return codexam;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public void setLugarci(String lugarci) {
        this.lugarci = lugarci;
    }

    public void setCodexam(long codexam) {
        this.codexam = codexam;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

   
    public String getProftut() {
        return proftut;
    }

    public void setProftut(String proftut) {
        this.proftut = proftut;
    }

    public void setNomtut(String nomtut) {
        this.nomtut = nomtut;
    }

    public String getDirtut() {
        return dirtut;
    }

    public void setDirtut(String dirtut) {
        this.dirtut = dirtut;
    }

    public String getFechaci() {
        return fechaci;
    }

    public void setFechaci(String fechaci) {
        this.fechaci = fechaci;
    }

    public String getCorrtut() {
        return corrtut;
    }

    public void setCorrtut(String corrtut) {
        this.corrtut = corrtut;
    }

    public String getUbitut() {
        return ubitut;
    }

    public void setUbitut(String ubitut) {
        this.ubitut = ubitut;
    }

    public long getCctut() {
        return cctut;
    }

    public void setCctut(long cctut) {
        this.cctut = cctut;
    }

    public long getTeltut() {
        return teltut;
    }

    public void setTeltut(long teltut) {
        this.teltut = teltut;
    }

    public long getEdadtut() {
        return edadtut;
    }

    public void setEdadtut(long edadtut) {
        this.edadtut = edadtut;
    }

   
}

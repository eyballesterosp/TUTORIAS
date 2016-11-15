/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;

public class Estudiante extends Persona implements Serializable{
    
    private String nomest,direst,correst,ubiest;
    private long ccest,telest,edadest,cartera;

    public Estudiante(String nomest, String direst, String correst, String ubiest, long ccest, long telest, long edadest, String persona, String tipo, String nombrepersona, String contraseña,long cartera) {
        super(persona, tipo, nombrepersona, contraseña);
       
        this.nomest = nomest;
        this.direst = direst;
        this.correst = correst;
        this.ubiest = ubiest;
        this.ccest = ccest;
        this.telest = telest;
        this.edadest = edadest;
        this.cartera=cartera;
        
    }
    public Estudiante(String persona,String tipo,String nombrepersona,String contraseña){
        super(persona, tipo, nombrepersona, contraseña);
           }
    
    public String getNomest() {
        return nomest;
    }

    public void setNomest(String nomest) {
        this.nomest = nomest;
    }

    public String getDirest() {
        return direst;
    }

    public void setDirest(String direst) {
        this.direst = direst;
    }

    public String getCorrest() {
        return correst;
    }

    public void setCorrest(String correst) {
        this.correst = correst;
    }

    public String getUbiest() {
        return ubiest;
    }

    public long getCartera() {
        return cartera;
    }

    public void setCartera(long cartera) {
        this.cartera = cartera;
    }

    public void setUbiest(String ubiest) {
        this.ubiest = ubiest;
    }
    
    public long getCcest() {
        return ccest;
    }

    public void setCcest(long ccest) {
        this.ccest = ccest;
    }

    public long getTelest() {
        return telest;
    }

    public void setTelest(long telest) {
        this.telest = telest;
    }

    public long getEdadest() {
        return edadest;
    }

    public void setEdadest(long edadest) {
        this.edadest = edadest;
    }
}

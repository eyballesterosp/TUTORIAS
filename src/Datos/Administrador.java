/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;

public class Administrador extends Persona implements Serializable{
     private String nombadm,diradm,lugarnacadm,corradm;
    private long ccadm,teladm,codadm;

    public Administrador(String nombadm, String diradm, String corradm, long ccadm, long teladm, long codadm, String persona, String tipo, String nombrepersona, String contraseña) {
        super(persona, tipo, nombrepersona, contraseña);
        this.nombadm = nombadm;
        this.diradm = diradm;
        this.corradm = corradm;
        this.ccadm = ccadm;
        this.teladm = teladm;
        this.codadm = codadm;
 }

    public Administrador(String persona,String tipo,String nombrepersona,String contraseña){
        super(persona, tipo, nombrepersona, contraseña);
    }
    public String getNombadm() {
        return nombadm;
    }

    public void setNombadm(String nombadm) {
        this.nombadm = nombadm;
    }

    public String getDiradm() {
        return diradm;
    }

    public void setDiradm(String diradm) {
        this.diradm = diradm;
    }

  

    public String getLugarnacadm() {
        return lugarnacadm;
    }

    public void setLugarnacadm(String lugarnacadm) {
        this.lugarnacadm = lugarnacadm;
    }

  
    public String getCorradm() {
        return corradm;
    }

    public void setCorradm(String corradm) {
        this.corradm = corradm;
    }

    public long getCcadm() {
        return ccadm;
    }

    public void setCcadm(long ccadm) {
        this.ccadm = ccadm;
    }

    public long getTeladm() {
        return teladm;
    }

    public void setTeladm(long teladm) {
        this.teladm = teladm;
    }



    public long getCodadm() {
        return codadm;
    }

    public void setCodadm(long codadm) {
        this.codadm = codadm;
    }
}

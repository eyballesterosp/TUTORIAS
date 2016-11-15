/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;


public class Tutorias implements Serializable{
    private String nomtutor,nomreestu,lugartu,fechatut,horatut,tematut,estado,calt,come;
    private long tel,costo;

    public Tutorias(String nomtutor, String nomreestu, String lugartu, String fechatut, String horatut, String tematut, String estado, long tel, long costo,String calt,String come) {
        this.nomtutor = nomtutor;
        this.nomreestu = nomreestu;
        this.lugartu = lugartu;
        this.fechatut = fechatut;
        this.horatut = horatut;
        this.tematut = tematut;
        this.estado = estado;
        this.tel = tel;
        this.costo = costo;
        this.calt=calt;
        this.come=come;
    }

    public String getCalt() {
        return calt;
    }

    public void setCalt(String calt) {
        this.calt = calt;
    }

    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
    }

    public String getNomtutor() {
        return nomtutor;
    }

    public void setNomtutor(String nomtutor) {
        this.nomtutor = nomtutor;
    }

    public String getNomreestu() {
        return nomreestu;
    }

    public void setNomreestu(String nomreestu) {
        this.nomreestu = nomreestu;
    }

    public String getLugartu() {
        return lugartu;
    }

    public void setLugartu(String lugartu) {
        this.lugartu = lugartu;
    }

    public String getFechatut() {
        return fechatut;
    }

    public void setFechatut(String fechatut) {
        this.fechatut = fechatut;
    }

    public String getHoratut() {
        return horatut;
    }

    public void setHoratut(String horatut) {
        this.horatut = horatut;
    }

    public String getTematut() {
        return tematut;
    }

    public void setTematut(String tematut) {
        this.tematut = tematut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    
}

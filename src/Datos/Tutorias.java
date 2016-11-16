
package Datos;

import java.io.Serializable;


public class Tutorias implements Serializable{
    private String nameTutor,nameEst,lugarTu,fechaTut,horaTut,temaTut,estado,calTut,come;
    private long tel,costo;

    public Tutorias(String nameTutor, String nameEst, String lugarTu, String fechaTut, String horaTut, String temaTut, String estado, String calTut, String come, long tel, long costo) {
        this.nameTutor = nameTutor;
        this.nameEst = nameEst;
        this.lugarTu = lugarTu;
        this.fechaTut = fechaTut;
        this.horaTut = horaTut;
        this.temaTut = temaTut;
        this.estado = estado;
        this.calTut = calTut;
        this.come = come;
        this.tel = tel;
        this.costo = costo;
    }

    public String getNameTutor() {
        return nameTutor;
    }

    public void setNameTutor(String nameTutor) {
        this.nameTutor = nameTutor;
    }

    public String getNameEst() {
        return nameEst;
    }

    public void setNameEst(String nameEst) {
        this.nameEst = nameEst;
    }

    public String getLugarTu() {
        return lugarTu;
    }

    public void setLugarTu(String lugarTu) {
        this.lugarTu = lugarTu;
    }

    public String getFechaTut() {
        return fechaTut;
    }

    public void setFechaTut(String fechaTut) {
        this.fechaTut = fechaTut;
    }

    public String getHoraTut() {
        return horaTut;
    }

    public void setHoraTut(String horaTut) {
        this.horaTut = horaTut;
    }

    public String getTemaTut() {
        return temaTut;
    }

    public void setTemaTut(String temaTut) {
        this.temaTut = temaTut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCalTut() {
        return calTut;
    }

    public void setCalTut(String calTut) {
        this.calTut = calTut;
    }

    public String getCome() {
        return come;
    }

    public void setCome(String come) {
        this.come = come;
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
package Datos;

public class Calificaciones {

    public long ccTut, puntaje, codExam;
    public String fechaCi, lugarCi, nombreAspirante;

    public Calificaciones(long ccTut, long puntaje, long codExam, String fechaCi, String lugarCi, String nombreAspirante) {
        this.ccTut = ccTut;
        this.puntaje = puntaje;
        this.codExam = codExam;
        this.fechaCi = fechaCi;
        this.lugarCi = lugarCi;
        this.nombreAspirante = nombreAspirante;
    }

    public long getCcTut() {
        return ccTut;
    }

    public void setCcTut(long ccTut) {
        this.ccTut = ccTut;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public long getCodExam() {
        return codExam;
    }

    public void setCodExam(long codExam) {
        this.codExam = codExam;
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

    public String getNombreAspirante() {
        return nombreAspirante;
    }

    public void setNombreAspirante(String nombreAspirante) {
        this.nombreAspirante = nombreAspirante;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Materias {
    
    String materia;
    long cc;

    public Materias(long cc,String materia) {
        this.materia = materia;
        this.cc = cc;
    }

    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }
    
}

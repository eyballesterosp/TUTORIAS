package Datos;

public class Materias {

    String materia;
    long id;

    public Materias(long id, String materia) {
        this.materia = materia;
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}

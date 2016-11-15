package Datos;

public class MateriasEs {

    String materia;
    long id;

    public MateriasEs(long id, String materia) {
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

    public void setId(long cc) {
        this.id = id;
    }

}

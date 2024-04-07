package ar.edu.unju.fi.model;

public class RegistroNota {
    private String codigo;
    private Alumno alumno;
    private Materia materia;
    private Float notaFinal;

    public RegistroNota() {
    }

    public RegistroNota(String codigo, Alumno alumno , Materia materia, Float notaFinal) {
        this.alumno = alumno;
        this.codigo = codigo;
        this.materia = materia;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Registro de Nota {\n" +
                "\tcodigo= " + codigo + "\n" +
                "\talumno= " + alumno + "\n" +
                "\tmateria= " + materia + "\n" +
                "\tnota-final= " + notaFinal + "\n" +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Float notaFinal) {
        this.notaFinal = notaFinal;
    }
}

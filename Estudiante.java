public class Estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaProyecto;

    public Estudiante(String nombre, double nota1, double nota2, double nota3, double notaProyecto) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaProyecto = notaProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 100) this.nota1 = 0;
        else this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 100) this.nota2 = 0;
        else this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 < 0 || nota3 > 100) this.nota3 = 0;
        else this.nota3 = nota3;
    }

    public double getNotaProyecto() {
        return notaProyecto;
    }

    public void setNotaProyecto(double notaProyecto) {
        if (notaProyecto < 0 || notaProyecto > 100) this.notaProyecto = 0;
        else this.notaProyecto = notaProyecto;
    }

    public double calcularNotaFinal() {
        double promedio;
        double notaFinal;
        promedio = (nota1 + nota2 + nota3) / 3;
        notaFinal = (promedio * 0.70) + (notaProyecto * 0.30);
        return notaFinal;
    }

    public String obtenerEstado() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 90) {
            return "Excelente";
        } else if (notaFinal >= 70) {
            return "Aprobado";
        } else if (notaFinal >= 60) {
            return "En recuperación";
        } else {
            return "Reprobado";
        }
    }

    public String toString() {
        return nombre + " │ Nota final: " + calcularNotaFinal() + " │ " + obtenerEstado();
    }
}
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos estudiantes: ");
        int n = sc.nextInt();

        Estudiante estudiantes[] = new Estudiante[n];

         (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("Estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            System.out.print("Proyecto: ");
            double proyecto = sc.nextDouble();

            estudiantes[i] = new Estudiante(nombre, nota1, nota2, nota3, proyecto);
        }

        System.out.println("REPORTE");

         (int i = 0; i < n; i++) {

            System.out.println(estudiantes[i]);
        }

        double suma = 0;
        double mayor = 0;
        double menor = 100;

        String nombreMayor = "";
        String nombreMenor = "";

        int aprobados = 0;

         (int i = 0; i < n; i++) {

            double nota = estudiantes[i].calcularNotaFinal();

            suma = suma + nota;

            if (nota > mayor) {

                mayor = nota;
                nombreMayor = estudiantes[i].getNombre();
            }

            if (nota < menor) {

                menor = nota;
                nombreMenor = estudiantes[i].getNombre();
            }

            if (nota >= 70) {

                aprobados++;
            }
        }

        double promedio = suma / n;

        System.out.println("Promedio: " + promedio);

        System.out.println("Mayor: " + mayor);

        System.out.println("Nombre mayor: " + nombreMayor);

        System.out.println("Menor: " + menor);

        System.out.println("Nombre menor: " + nombreMenor);

        System.out.println("Aprobados: " + aprobados);
    }
}
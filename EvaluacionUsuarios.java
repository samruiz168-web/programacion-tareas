import java.util.Scanner;

public class EvaluacionUsuarios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("-- Usuario " + i + " --");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();

            double calificacion;
            do {
                System.out.print("Calificación (0-100): ");
                calificacion = sc.nextDouble();
                if (calificacion < 0 || calificacion > 100)
                    System.out.println("Error: la calificación debe estar entre 0 y 100.");
            } while (calificacion < 0 || calificacion > 100);

            sc.nextLine();

            String edadClasificacion;
            if (edad >= 18)
                edadClasificacion = "Mayor de edad";
            else
                edadClasificacion = "Menor de edad";

            String resultado;
            if (calificacion >= 90)
                resultado = "Excelente";
            else if (calificacion >= 80)
                resultado = "Muy bueno";
            else if (calificacion >= 70)
                resultado = "Bueno";
            else if (calificacion >= 60)
                resultado = "Regular";
            else
                resultado = "Reprobado";

            System.out.println("Nombre          : " + nombre);
            System.out.println("Edad            : " + edad + " (" + edadClasificacion + ")");
            System.out.println("Calificación    : " + calificacion + " - " + resultado);
            System.out.println();
        }
    }
}
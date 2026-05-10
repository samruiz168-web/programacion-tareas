package Prueba.tareas;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        int suma = a + b + c;
        double promedio = (double) suma / 3;
        int producto = a * b * c;

        int menor = a;
        int mayor = a;

        if (b < menor) menor = b;
        if (c < menor) menor = c;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Producto: " + producto);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);

        sc.close();
    }
}
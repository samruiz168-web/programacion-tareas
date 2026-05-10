package Prueba.tareas;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número de 5 dígitos: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Error: el número debe tener exactamente 5 dígitos.");
        } else {
            int d1 = num / 10000;
            int d2 = (num % 10000) / 1000;
            int d3 = (num % 1000) / 100;
            int d4 = (num % 100) / 10;
            int d5 = num % 10;

            System.out.println(d1 + "   " + d2 + "   " + d3 + "   " + d4 + "   " + d5);
        }

        sc.close();
    }
}
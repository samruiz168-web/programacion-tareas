import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " es más grande");
        } else if (b > a) {
            System.out.println(b + " es más grande");
        } else {
            System.out.println("Estos números son iguales");
        }

        sc.close();
    }
}

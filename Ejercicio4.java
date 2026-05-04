import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número 1: ");
        int n1 = sc.nextInt();

        System.out.print("Ingresa el número 2: ");
        int n2 = sc.nextInt();

        System.out.print("Ingresa el número 3: ");
        int n3 = sc.nextInt();

        System.out.print("Ingresa el número 4: ");
        int n4 = sc.nextInt();

        System.out.print("Ingresa el número 5: ");
        int n5 = sc.nextInt();

        int mayor = n1;
        int menor = n1;

        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;
        if (n4 > mayor) mayor = n4;
        if (n5 > mayor) mayor = n5;

        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        if (n5 < menor) menor = n5;

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Datos De La Calculadora===========");

        System.out.println("Ingrese el primer numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double multiplicación = numero1 * numero2;
        double resta = numero1 - numero2;

        System.out.println("\n---Resultados---");

        System.out.println("Suma: "+ numero1 + "+" + numero2 + "=" + suma);
        System.out.println("Multiplicación: "+ numero1 + "*" + numero2 + "=" + multiplicación);
        System.out.println("Resta: "+ numero1 + "-" + numero2 + "=" + resta);

        if (numero2 != 0) {
        double Dividir = numero1 / numero2;
        System.out.println("Dividir: "+ numero1 + "/"+ numero2 + "="+ Dividir);

      } else {
        System.out.println("Dividir: Numero no se puede dividir entre 0");
        }

        scanner.close();





         






        
    }
}
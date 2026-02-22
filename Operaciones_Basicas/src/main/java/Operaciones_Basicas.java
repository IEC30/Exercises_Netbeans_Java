
import java.util.Scanner;

public class Operaciones_Basicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion,nums;
        double n, total = 0,n1,n2,division;

        System.out.println("OPERACIONES BASICAS v1.0");
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");
        System.out.println("----------------------------------------");
        System.out.println("Elige la opcion de lo que desees realizar: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa cuantos numeros vas a sumar: ");
                nums = scanner.nextInt();

                for (int i = 0; i < nums; i++) {
                    System.out.println("Ingresa el numero " + (i + 1) + ": ");
                    n = scanner.nextDouble();

                    total = total + n;

                }
                System.out.println("El total de tu suma es igual a: " + total);
                break;

            case 2:
                System.out.println("Ingresa cuantos numeros vas a restar: ");
                nums = scanner.nextInt();

                System.out.println("Ingresa el numero 1: ");
                total = scanner.nextDouble();

                for (int i = 1; i < nums; i++) {
                    System.out.println("Ingresa el numero " + (i + 1) + ": ");
                    n = scanner.nextDouble();

                    total = total - n;
                }
                System.out.println("El total de tu resta es igual a: " + total);
                break;

            case 3:
                System.out.println("Ingresa cuantos numeros vas a multiplicar: ");
                nums = scanner.nextInt();

                System.out.println("Ingresa el numero 1: ");
                total = scanner.nextDouble();

                for (int i = 1; i < nums; i++) {
                    System.out.println("Ingresa el numero " + (i + 1) + ": ");
                    n = scanner.nextDouble();

                    total = total * n;
                }
                System.out.println("El total de tu multiplicacion es igual a: " + total);
                break;

            case 4:
                System.out.println("Ingresa el numero 1: ");
                n1 = scanner.nextDouble();
                System.out.println("Ingresa el numero 2: ");
                n2 = scanner.nextDouble();

                division=n1/n2;
                
                System.out.println("El total de tu division es igual a: " + division);
                break;

        }

    }
}

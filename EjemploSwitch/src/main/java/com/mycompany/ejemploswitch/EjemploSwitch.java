/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploswitch;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class EjemploSwitch {

    public static void main(String[] args) {
        
        // crea el objeto scanner que permite asignar valores al iniciar el programa
        Scanner scanner = new Scanner(System.in);
        int cal;
        // ejecuta todo lo que esta dentro hasta que termine la condicion dentro del while
        do{
            System.out.println("Introduce tu calificacion");
            cal = scanner.nextInt();
            
            // funciona en caso de ingresar cantidades que no tengan case en el switch (1,2,3)
            if (cal<4&&cal>0)
                System.out.println("Es enserio??");
            
            switch (cal)
            {
                case 4:
                    System.out.println("Muy mal ");
                    break;
                case 5:
                    System.out.println("Sigue intentando");
                    break;
                case 6:
                    System.out.println("Mehh ! ");
                    break;
                case 7:
                    System.out.println("Casi lo logras");
                    break;
                case 8:
                    System.out.println("Bien");
                    break;
                case 9:
                    System.out.println("Muy bien");
                    break; 
                case 10:
                    System.out.println("Excelente");
                    break;
                    
                default:
                    if (cal<=0||cal>10)
                        System.out.println("ERROR");
                    break;
            }
        }while(cal<=0||cal>10);
    }
}


// crear un progama que evalue un valor, similar que pida un dato entero
// entonces seria como el ejemplo que al colocar una cantidad muestre un mensaje y si no se repite hasta cumplirlo
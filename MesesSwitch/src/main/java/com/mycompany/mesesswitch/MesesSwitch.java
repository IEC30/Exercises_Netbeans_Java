/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mesesswitch;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MesesSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        System.out.println ("Ingrese un numero para conocer el mes: ");
        num=scanner.nextInt();
        
        switch(num)
        {
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break; 
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
                
            default:
                    if (num<=0||num>12)
                    System.out.println("ERROR");
                    break;
        }
    }
}

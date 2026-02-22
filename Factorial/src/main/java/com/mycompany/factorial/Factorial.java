/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        
        int num= scanner.nextInt();
        System.out.println("\nEl factorial de " +num+ " es " + factorial(num));
    }
    public static int factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        else 
            return num * factorial(num-1);
    }
}

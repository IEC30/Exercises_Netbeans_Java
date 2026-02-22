/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serie_figonacci;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Serie_fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = scanner.nextInt();
        
        for (int i=0; i<=num; i++)
        {
            int fibonacciNumber=fibonacci(i);
            System.out.println(" " + fibonacciNumber);
        }
        
        System.out.println("\n La serie fibonacci del numero " + num + " es: " + fibonacci(num));
        
    }
    public static int fibonacci(int num)
    {
        if(num==0)
            return 0;
        
        else if (num==1)
            return 1;
        
        else
            return fibonacci(num-1)+fibonacci(num-2);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.serie_fibonacci2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Serie_fibonacci2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0, y=1, n, a;
        System.out.println("Ingresa el tamaño de la serie");
        a= scanner.nextInt();
        System.out.println("La serie fibonacci de "+a+"es: ");
        
        for (int i=0; i<=a; i++)
        {
            System.out.println(x);
            n=x+y;
            x=y;
            y=n;
        }
    }
}
    


    


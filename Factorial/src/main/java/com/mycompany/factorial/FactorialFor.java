/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.factorial;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class FactorialFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,factorial=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num=scanner.nextInt();
       
        for (int i=1;i<=num;i++)
             factorial*=i;
        {
            System.out.println("\n El factorial de " +num+ " es " + factorial);
        }
    }
    
}

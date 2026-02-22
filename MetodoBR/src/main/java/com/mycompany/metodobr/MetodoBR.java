/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodobr;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MetodoBR {

    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        
        int tamaño;
        
        // solicitar cantidad de datos a ingresar
        System.out.println("Cantidad de numeros a ingresar: ");
        tamaño = entrada.nextInt();
        
        // validar
        if(tamaño<=0)
        {
            do{
               System.out.println("EL numero ingresado es ilogico, intente de nuevo...");
               System.out.println("Cantidad de numeros a ingresar: ");
               tamaño = entrada.nextInt();
            } while(tamaño<=0);
        }
        
        // declaracion de array para almacenar los numeros
        int[] ejemplo = new int[tamaño];
        
        // solicitar los numeros
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese un números " + (i + 1) + ": ");
            ejemplo[i] = entrada.nextInt();
        }
        
        //ordenar el array de menor a mayor
        Ordenar or = new Ordenar();
        or.ordenar(ejemplo);
        
        // impresion de datos
        System.out.println("");
        for (int i=0; i<ejemplo.length; i++)
        {
            System.out.println(ejemplo[i]);
        }
    }
}

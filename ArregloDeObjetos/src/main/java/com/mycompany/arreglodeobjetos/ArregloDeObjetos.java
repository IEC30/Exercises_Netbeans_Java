/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglodeobjetos;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ArregloDeObjetos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int edad, tamaño;
        double promedio;
        
        System.out.println("¿Cuántos estudiantes desea registrar? ");
        tamaño = entrada.nextInt();
        if(tamaño<=0)
        {
            do{
               System.out.println("EL numero de estudiantes ingresados es ilogico, intente de nuevo...");
               System.out.println("¿Cuántos estudiantes desea registrar? ");
               tamaño = entrada.nextInt();
            } while(tamaño<=0);
        }
        
        Estudiante estudiantes[] = new Estudiante[tamaño];
        
        System.out.println("");
        
        for(int i=0; i<estudiantes.length; i++)
        {
           System.out.println("Ingrese el nombre del estudiante numero "+(i+1)+": ");
           nombre = entrada.next();
           System.out.println("Ingrese la edad del estudiante numero "+(i+1)+": ");
           edad = entrada.nextInt();
           
           if(edad<=0)
           {
               do
               {
                   System.out.println("La edad ingresada es ilogica, intente de nuevo...");
                   System.out.println("Ingrese la edad del estudiante numero "+(i+1)+": ");
                   edad = entrada.nextInt();
               } while(edad<=0);
           }
           
           
           System.out.println("Ingrese el promedio del estudiante numero "+(i+1)+": ");
           promedio  = entrada.nextDouble();
           if(promedio<=0)
           {
               do
               {
                   System.out.println("El promedio ingresado es ilogico, intente de nuevo...");
                   System.out.println("Ingrese el promedio del estudiante numero "+(i+1)+": ");
                   promedio = entrada.nextDouble();
               } while(promedio<=0);
           }
           
           
           estudiantes[i] = new Estudiante(nombre, edad, promedio);
           System.out.println("");
        }
        for(int i = 0; i<estudiantes.length; i++)
        {
            System.out.println(estudiantes[i]);
        }
    }
}

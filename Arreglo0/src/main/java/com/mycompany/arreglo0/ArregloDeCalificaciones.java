/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglo0;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ArregloDeCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numAlum, i;
        double suma = 0, media;
        
        do 
        {
            System.out.println("Número de alumnos en la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);
        
        double [] notas = new double[numAlum]; //se crea el array
        
        //la nota introducida por teclado
        for (i = 0; i <  notas.length; i++)
        {
            System.out.println("Alumno " + (i + 1) + " Notal final: ");
            notas[i] = sc.nextDouble();
        }
        
        //suma de las notas
        for (i = 0; i < notas.length; i++)
        {
            suma = suma + notas[i];
        }
        
        // calcular la media
        media = suma / notas.length;
        
        // mostrar la media
        System.out.println("Promedio del curso: "+ media);
        
        // mostrar los valores superiores a la media
        System.out.println("\n________________________________");
        System.out.println("Listado de notas superiores al promedio");
        for (i = 0; i < notas.length; i++)
        {
            if (notas[i] > media)
            {
                System.out.println("Alumno numero: " + (i + 1) + " Nota final: " + notas[i]);
            }
        }
    }
    
}

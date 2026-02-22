/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglolibro;
import java.util.Scanner;

public class ArregloLibro {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("¿Cuántos libros desea registrar? ");
        int tamaño= entrada.nextInt();
        if(tamaño<=0)
        {
            do{
               System.out.println("EL numero de libros ingresados es ilogico, intente de nuevo...");
               System.out.println("¿Cuántos libros desea registrar? ");
               tamaño = entrada.nextInt();
            } while(tamaño<=0);
        }                

        Libro libros[] = new Libro[tamaño];
        
        for(int i=0; i<libros.length; i++)
        {
        System.out.println("\nIngrese los datos del libro:");
        System.out.print("Id "+(i+1)+": ");
        int id=entrada.nextInt();
           if(id<=0)
           {
               do
               {
                   System.out.println("El ID es ilogica, intente de nuevo...");
                   System.out.println("Ingrese un valor correcto para el ID del libro "+(i+1)+": ");
                   id = entrada.nextInt();
               } while(id<=0);
           }        
        System.out.print("Autor "+(i+1)+": ");
        String autor=entrada.next();
        System.out.print("Título "+(i+1)+": ");
        String titulo=entrada.next();
        System.out.print("Editorial "+(i+1)+": ");
        String editorial=entrada.next();
        System.out.print("Páginas "+(i+1)+": ");
        int paginas=entrada.nextInt();
           if(paginas<=0)
           {
               do
               {
                   System.out.println("La cantidad de pagians es ilogica, intente de nuevo...");
                   System.out.println("Ingrese un valor correcto para las paginas del  libro "+(i+1)+": ");
                   paginas = entrada.nextInt();
               } while(id<=0);
           }           

        Libro libro=new Libro(id,autor,titulo,editorial,paginas);
        System.out.println("\nInformación del libro:");
        System.out.println(libro);
    }
    }
}

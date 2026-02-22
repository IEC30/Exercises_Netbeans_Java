/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglomascota;
import java.util.Scanner;

public class ArregloMascota {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("¿Cuántas mascotas desea registrar? ");
        int tamaño= entrada.nextInt();
        if(tamaño<=0)
        {
            do{
               System.out.println("EL numero de mascotas es ilogico, intente de nuevo...");
               System.out.println("¿Cuántas mascotas desea registrar? ");
               tamaño = entrada.nextInt();
            } while(tamaño<=0);
        }         

        Mascota mascotas[] = new Mascota[tamaño];
        
        for(int i=0; i<mascotas.length; i++)
        {        
        System.out.println("\nIngrese los datos de la mascota:");
        System.out.print("Id "+(i+1)+": ");
        int id=entrada.nextInt();
           if(id<=0)
           {
               do
               {
                   System.out.println("El ID es ilogica, intente de nuevo...");
                   System.out.println("Ingrese un valor correcto para el ID de la mascota "+(i+1)+": ");
                   id = entrada.nextInt();
               } while(id<=0);
           }         
        System.out.print("Nombre "+(i+1)+": ");
        String nombre=entrada.next();
        System.out.print("Raza "+(i+1)+": ");
        String raza=entrada.next();
        System.out.print("Color "+(i+1)+": ");
        String color=entrada.next();
        System.out.print("Tipo "+(i+1)+": ");
        String tipo=entrada.next();

        Mascota mascota=new Mascota(id,nombre,raza,color,tipo);
        System.out.println("\nInformacion de la mascota:");
        System.out.println(mascota);
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglodeobjeto2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ArregloDeObjeto2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        float region;
        int edad, tamaño;
        short numpoke;
        double estatura;
        
        System.out.println("¿Cuántos pokemones desea registrar? ");
        tamaño = entrada.nextInt();
        if(tamaño<=0)
        {
            do{
               System.out.println("EL numero de pokemones ingresados es ilogico, intente de nuevo...");
               System.out.println("¿Cuántos pokemones desea registrar? ");
               tamaño = entrada.nextInt();
            } while(tamaño<=0);
        }
        
        Pokemon pokemones[] = new Pokemon[tamaño];
        
        System.out.println("");
        
        for(int i=0; i<pokemones.length; i++)
        {
           System.out.println("Ingrese el nombre del pokemon numero "+(i+1)+": ");
           nombre = entrada.next();
           System.out.println("Ingrese el numero de registro del pokemon numero "+(i+1)+": ");
           numpoke = entrada.nextShort();
           System.out.println("Ingrese la edad del pokemon numero "+(i+1)+": ");
           edad = entrada.nextInt();
           System.out.println("Ingrese la estatura del pokemon numero "+(i+1)+": ");
           estatura = entrada.nextDouble();
           System.out.println("Ingrese la cantidad de regiones del pokemon numero "+(i+1)+": ");
           region = entrada.nextFloat();
           
           if(edad<=0)
           {
               do
               {
                   System.out.println("La edad ingresada es ilogica, intente de nuevo...");
                   System.out.println("Ingrese la edad del pokemon numero "+(i+1)+": ");
                   edad = entrada.nextInt();
               } while(edad<=0);
           }
           
           
           pokemones[i] = new Pokemon(nombre, numpoke, edad, estatura, region);
           System.out.println("");
        }
        for(int i = 0; i<pokemones.length; i++)
        {
            System.out.println(pokemones[i]);
        }
    }
}

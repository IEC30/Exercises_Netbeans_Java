/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedioasesoria;
import java.util.Scanner;
/**
 *
 * @author HP
 */

// optimizar para que no se repita ingrese el primer numero, el segundo numero
// que la suma de calificaciones sea de acuerdo a la cantidad de numeros ingresada
// utilizando for y do while, y que la condicion sea calificacion mayor o igual a 8
// y que al pedir calificaciones no permita ingresar numeros menores a 0
public class PromedioAsesoria {

    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            int rem,ext,cancali,ope=0,cali=0,promedio;

            // creacion de do while para pedir la cantidad de datos a ingresar
            do 
            {
                System.out.println("¿Cuántas calificaciones desea ingresar?");
                cancali=scanner.nextInt();
            } while(cancali<=0);


            // lectura de calificaciones e implementacion de for y do while 
            for (int i=0;i<cancali;i++)
            {
                do
                {
                System.out.println("Ingrese la calificación " + (i+1) + ": ");
                cali=scanner.nextInt();
                
                if (cali<0||cali>10)
                {
                    System.out.println("la calificacion debe de estar en el rango del 0 al 10");
                }
                } while(cali<0||cali>10);
                ope=ope+cali;
            }
            
            // operacion para calcular promedio
            promedio=ope/cancali;
        
            // cambiar a mayor o igual a 8, para que apruebe
            if(promedio>=8)
            {
                System.out.println("Aprobaste");
            }
            else
            {
            System.out.println("No aprobaste");
            System.out.println("Ingresa tu remedial: ");
            rem=scanner.nextInt ();
            if(rem>=8)
            {
                System.out.println("Aprobaste tu remedial");
            }
            else
            {
            System.out.println("No aprobaste tu remedial");
            System.out.println("Ingresa tu extraordinario");
            ext=scanner.nextInt();
            if (ext>=8)
            {
                System.out.println("Aprobaste el extraordinario");
            }
            else
            {
                System.out.println("Date de baja y llora, es opcional : ");
            }
        }
    }
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PROMEDIO {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double suma=0,cal,prom=0, remedial, extra;
        int numcal=0;
        
        System.out.println("Introduce el numero de calificaciones a capturar");
        numcal=scanner.nextInt();
        for(int contador=1;contador<=numcal;contador++)
        {
            System.out.println("Introduce la calificacion: " +contador);
            cal=scanner.nextDouble();
            
            suma=suma+cal;
            prom=suma/(numcal);
            
        }
         System.out.println("El promedio es : " +prom);
         if(prom>8)
         {
             System.out.println("Aprobaste");
         }
         else
         {
             System.out.println("Date de baja y llora :");
         }
    }
    
}
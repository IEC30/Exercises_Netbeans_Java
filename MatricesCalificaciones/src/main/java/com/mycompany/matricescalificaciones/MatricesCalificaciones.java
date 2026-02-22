/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricescalificaciones;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class MatricesCalificaciones {

    // INCOMPLETO CHECAR IF Y DO WHILE
    public static void main(String[] args) {
        
        Scanner cap = new Scanner (System.in);
        int ta, tm;
        double suma=0, promedio=0;
        
        System.out.println("Ingrese el número de alumnos de la clase: ");
        ta = cap.nextInt();
        System.out.println("Ingrese el número de materias: ");
        tm=cap.nextInt();
        if (ta<0||tm<0)
        {
            do{
                System.out.println("Ingrese un numero valido ");
                System.out.println("Ingrese el número de alumnos de la clase: ");
                ta = cap.nextInt();
                System.out.println("Ingrese el número de materias: ");
                tm=cap.nextInt();
            
            }while(ta<0||tm<0);
        }
        tm = cap.nextInt();
        
        // CREACION DE MATRIZ TIPO DOUBNLE
        double [][] calificaciones = new double [ta][tm];
        
        // for que permite ingresar en cada campo de la matris los datos
        for(int i=0; i<ta; i++){
            for(int j=0; j<tm; j++){
                // va insertando los datos en la matris, aumentando 1 en j  y 1 en i
                System.out.println("Ingresa la calificacion: "+(j+1)+" del estudiante "+(i+1));
                calificaciones[i][j]=cap.nextDouble();
        }
        }
         
        for(int i=0; i<ta; i++){
            for(int j=0; j<tm; j++){
                // se almacenan todas las calificaciones de la matriz en la variable suma
                suma=suma+calificaciones[i][j];
            }
            promedio=suma/calificaciones[0].length;
            System.out.println("El promedio del alumno "+(i+1)+" es: "+promedio);
            suma=0;
        }        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz0;

/**
 *
 * @author HP
 */
public class Matriz0 {

    public static void main(String[] args) {
        
        // Creacion de matriz
        int numeros[][]=new int [3][4];
        
        numeros [0][0] = 15;
        numeros [0][1] = 22;
        numeros [0][2] = 56;
        numeros [0][3] = 2;
        numeros [1][0] = 115;
        numeros [1][1] = 28;
        numeros [1][2] = 183;
        numeros [1][3] = 83;
        numeros [2][0] = 14;
        numeros [2][1] = 0;
        numeros [2][2] =36;
        numeros [2][3] = 100;
        
        System.out.print("[" + numeros[0][0] + "]");
        System.out.println("[" + numeros[0][1] + "]");
        System.out.print("[" + numeros[1][0] + "]");
        System.out.print("[" + numeros[1][1] + "]");

        // PERMITE MOSTRAR DE MANERA OPTIMA TODAS LAS MATRICEZ
     //   for (int i=0; i<3; i++){
      //      for (int j=0; j<4; j++)
      //      {
       //         System.out.println("["+numeros[i][j]+"]");
     //       }
     //   }  
        
    }
}

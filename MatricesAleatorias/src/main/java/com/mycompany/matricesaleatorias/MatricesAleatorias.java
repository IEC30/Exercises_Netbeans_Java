/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricesaleatorias;

/**
 *
 * @author HP
 */
public class MatricesAleatorias {

    public static void main(String[] args) {
        
        int matriz1[][] = new int[2][2];
        int matriz2[][] = new int[2][2];
        int matrizresultado[][] = new int [2][2];
        
        // llenado matriz1
        for (int i=0; i<matriz1.length;i++ ){
        for (int j=0; j<matriz1.length; j++){
            matriz1[i][j]= (int) (Math.random() * 7); // esta funcion devolvera numeros randoms con un limite que es 7
            
        }
    }
        // llenado matriz2
        for (int i=0; i<matriz2.length; i++){
        for (int j=0; j<matriz2.length; j++){
            matriz2[i][j] = (int) (Math.random() * 7);
        }
    }        
        // sumar las matrices
        for (int i=0; i<matriz1.length; i++ ){
        for (int j=0; j<matriz2.length; j++){
            matrizresultado[i][j] = matriz1[i][j] + matriz2[i][j]; // se realiza la suma
        }
    }
        
        // mostrar resultados
        for  (int i = 0; i<matriz1.length; i++){
            for (int j=0; j<matriz1.length; j++){
                System.out.print("[" + matriz1[i][j] + "]");
            }
            if (i == 1){
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }
            
        for  (int j = 0; j<matriz2.length; j++){
                System.out.print("[" + matriz2[i][j] + "]");
        }
            if (i == 1){
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            
            for (int j=0; j<matrizresultado.length; j++){
                System.out.print("[" + matrizresultado[i][j] + "]");
            }
            System.out.println("");
        }  
    }
}

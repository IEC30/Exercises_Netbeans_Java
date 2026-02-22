/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizalumnos;

/**
 *
 * @author HP
 */
public class MatrizAlumnos {

    public static void main(String[] args) {
        
                // Creacion de matriz
        String alumnos[][]=new String [3][5];
        
        alumnos [0][0] = "Edgar";
        alumnos [0][1] = "Juan";
        alumnos [0][2] = "Bladimir";
        alumnos [0][3] = "Eduardo";
        alumnos [0][4] = "Andres";
        alumnos [1][0] = "Neftali";
        alumnos [1][1] = "Marco";
        alumnos [1][2] = "Adolfo";
        alumnos [1][3] = "Miriam";
        alumnos [1][4] = "Luis";
        alumnos [2][0] = "Cesar";
        alumnos [2][1] = "Sofia";
        alumnos [2][2] = "Julia";
        alumnos [2][3] = "Noe";
        alumnos [2][4] = "Racid";
        
                for (int i=0; i<alumnos.length; i++){
            for (int j=0; j<5; j++)
            {
                System.out.println("["+alumnos[i][j]+"]");
            }
        } 
    }
}

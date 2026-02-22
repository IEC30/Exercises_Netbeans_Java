/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglo0;

/**
 *
 * @author HP
 */
public class Arreglo1Resp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [] Alumnos={"Edgar","Juan","Racid","Bladimir","Noe","Sofia","Luis","Marco","Andres","Miriam","Neftali",
        "Julia","Adolfo","Cesar","Eduardo"};
        System.out.println("Muestra los nombres de los alumnos: "+Alumnos.length);
        for(int indice=0;indice<Alumnos.length;indice++) 
        {
            System.out.println("El indice: "+indice+" es: "+Alumnos[indice]);
        }
    }
    
}

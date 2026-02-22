/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP
 */
public class Recursividad {
    
    public void mostrar(int numero)
    {
        if(numero<=10)
        {
            System.out.println(numero+ "");
            mostrar(numero+1);
        }
    }
}

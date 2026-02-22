/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodobr;

/**
 *
 * @author HP
 */
public class MetodoBR {

    public static void main(String[] args) {
        
        int []ejemplo={18,19,21,25};
        Ordenar or = new Ordenar();
        or.ordenar(ejemplo);
        for (int i=0; i<ejemplo.length; i++)
        {
            System.out.println(ejemplo[i]);
        }
    }
}

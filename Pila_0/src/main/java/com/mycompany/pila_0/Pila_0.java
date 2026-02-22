/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pila_0;
import java.util.Stack;
/**
 *
 * @author HP
 */
public class Pila_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack st= new Stack ();
        st.push("Mi");
        st.push("Primera");
        st.push("Pila");
        System.out.println(st);
        
        System.out.println(st.peek()); //obtener 
        
        System.out.println(st.empty()); // checa si esta vacia
        System.out.println(st.size()); //tamaño de la pila
        System.out.println(st.pop());
        System.out.println(st.size());
    }
    
}

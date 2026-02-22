/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Pila {
    
    private Nodo cima;
    int longitud;
    public Pila()
    {
        cima= null;
        longitud= 0;
    }
    
    public boolean estaVacia()
    {
        return cima== null;
    }
    
    public void push (double elemento)
    {
        Nodo nuevo= new Nodo (elemento);
        nuevo.siguiente= cima;
        cima= nuevo;
        longitud ++;
    }
    
    public double pop()
    {
        double auxiliar= cima.dato;
        cima= cima.siguiente;
        longitud--;
        return auxiliar;
    }
     
    public double cima()
    {
        return cima.dato;
    }

    public int tamañoPila()
    {
        return longitud;
    }

    public void vaciarPila()
    {
        while(!estaVacia())
        {
            pop();
        }
  }
}

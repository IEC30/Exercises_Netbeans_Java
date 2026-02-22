/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP
 */
public class Pila {
    private NodoPila cima;
    int longitud;
    public Pila() {
        cima = null;
        longitud = 0;
    }
    
    //Esta vacia
    public boolean estaVacia() {
        return cima == null;
    }
    
    //Insertar push
    public void push (double elemento) {
        NodoPila nuevo = new NodoPila (elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        longitud ++;
    }
    
    //Obtener pop
    public double pop() {
        double auxiliar = cima.dato;
        cima = cima.siguiente;
        longitud--;
        return auxiliar;
    }
    
    //Mostrar la cima
    public double cima() {
        return cima.dato;
    }
    
    //Mostrar tamaño
    public int tamañoPila() {
        return longitud;
    }
    
    //Vaciar
    public void vaciarPila() {
        while(!estaVacia()) {
            pop();
        }
    }
}

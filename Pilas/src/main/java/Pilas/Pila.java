/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author HP
 */
public class Pila {
    
    Nodo raiz;
    
    //metodo para agregar un estudiante a la pila
    //si la pila esta vacia el estudiante seria la raiz de la pila
    //si la pila ya tiene estuiantes se establece como raiz al utlimo ingresado
    public void apilar(Estudiante datosEstudiante) {
        Nodo nuevo = new Nodo(datosEstudiante);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            if (datosEstudiante != null) {
                nuevo.setSiguiente(raiz);
                raiz = nuevo;
            }
        }
    }
    
    //metodo para listar los estudiantes almacenados en la pila
    public void imprimir() {
        Nodo temp = raiz;
        while (temp != null) {
            System.out.println("Código: " + temp.getDato().getCodigo() +
                    "\nNombre: " + temp.getDato().getNombre() +
                    "\nEdad: " + temp.getDato().getEdad() + "\n\n");
            temp = temp.getSiguiente();
        }
    }
    
    //metood para sumar las edades de todos los estudiantes almacenados en la pila
    public int sumaDeEdades() {
        Nodo temp = raiz;
        int suma = 0;
        while (temp != null) {
            suma += temp.getDato().getEdad();
            temp = temp.getSiguiente();
        }
        
        return suma;
    }
}

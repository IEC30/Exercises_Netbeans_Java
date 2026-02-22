/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas;

/**
 *
 * @author HP
 */
public class EjecutarPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creamos una pila para almacenar los estudiantes
        Pila pilaDeEstudiantes = new Pila();
        
        //Apilamos (agregamos) estudiantes en la pila
        pilaDeEstudiantes.apilar(new Estudiante(123, "Edgar", 20));
        pilaDeEstudiantes.apilar(new Estudiante(456, "Bladimir", 21));
        pilaDeEstudiantes.apilar(new Estudiante(789, "Racid", 22));
        pilaDeEstudiantes.apilar(new Estudiante(790, "Juan", 19));
        pilaDeEstudiantes.apilar(new Estudiante(791, "Noe", 30));
        
        //imprimir los estudiantes almacenados en la pila
        pilaDeEstudiantes.imprimir();
        
        //imprimir la suma de las edades de todos los estudiantes almacenados en la pila
        System.out.println("La suma de las edades es: " + pilaDeEstudiantes.sumaDeEdades());
    }
    
}

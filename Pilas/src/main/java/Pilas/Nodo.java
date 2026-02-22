/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author HP
 */
public class Nodo {
    //Atributos
    private Estudiante datosEstudiante;
    private Nodo siguiente;
    
    //Constructor
    public Nodo(Estudiante datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }
    
    //Getters and Setters
    public Estudiante getDato() {
        return datosEstudiante;
    }
    
    public void setDato(Estudiante datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }
    
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglodeobjetos;

/**
 *
 * @author HP
 */
public class Estudiante {
    private String Nombre;
    private int Edad;
    private double Promedio;
    
    public Estudiante(String nombre, int edad, double promedio){
        Nombre=nombre;
        Edad=edad;
        Promedio=promedio;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+Nombre+"\nEdad: "+Edad+"\nPromedio: "+Promedio+"\n";
    }
}

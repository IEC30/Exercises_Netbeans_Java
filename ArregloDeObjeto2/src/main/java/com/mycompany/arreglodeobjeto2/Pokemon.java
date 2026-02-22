/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglodeobjeto2;

/**
 *
 * @author HP
 */
public class Pokemon {
    private String Nombre;
    private short NumPoke;
    private int Edad;
    private double Estatura;
    private float Region; 
    
    public Pokemon(String nombre, short numpoke, int edad, double estatura, float region){
        Nombre=nombre;
        NumPoke=numpoke;
        Edad=edad;
        Estatura=estatura;
        Region=region;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+Nombre+"\nNumero de pokemon: "+NumPoke+"\nEdad: "+Edad+"\nEstatura: "+Estatura+"\nRegion: "+Region+"\n";
    }
}

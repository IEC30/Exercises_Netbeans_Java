/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP
 */
public class Nodo {
    int dato;
    String nombre;
    Nodo hijoizquierdo, hijoderecho;
    public Nodo(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoderecho=null;
        this.hijoizquierdo=null;
    }
    public String toString(){
        return nombre +" El dato es: "+dato;
    }
}

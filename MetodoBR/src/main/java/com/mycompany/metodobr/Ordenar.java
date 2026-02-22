/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodobr;

/**
 *
 * @author HP
 */
public class Ordenar {
    public void ordenar (int [] ejemplo){
        int temporal;
        boolean cambio=false;
        // se inicia el bucle que se ejecuta mientras se sigan realizando cambios
        while(true){
            // indica que no hay cambios
            cambio=false;
            // inicia el bucle que recorre el array
            for (int i=1; i<ejemplo.length; i++){
                // indica que si un elemento es menor que el anterior se intercambian
                if(ejemplo[i]<ejemplo[i-1]){
                    // se guarda el nuevo valor al en la variable temporal
                    temporal=ejemplo[i];
                    // el valor del elemento anterior se coloca en la posicion actual
                    ejemplo[i]=ejemplo[i-1];
                    // la variable temporal se queda en la posicion anterior
                    ejemplo[i-1]=temporal;
                    // indica que si hay cambios
                    cambio=true;
                }
        }   
            // en caso de que no se haya realizado ninguna iteracion, automaticamente sale del bucle
            if(cambio==false)
                break;
        }
    }
}

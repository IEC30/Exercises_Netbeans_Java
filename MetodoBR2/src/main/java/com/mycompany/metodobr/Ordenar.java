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
        while(true){
            cambio=false;
            for (int i=1; i<ejemplo.length; i++){
                if(ejemplo[i]<ejemplo[i-1]){
                    temporal=ejemplo[i];
                    ejemplo[i]=ejemplo[i-1];
                    ejemplo[i-1]=temporal;
                    cambio=true;
                }
        }
            if(cambio==false)
                break;
        }
    }
}

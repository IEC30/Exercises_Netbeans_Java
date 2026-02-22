/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

public class Lista {
    Nodo ultimo;
    public Lista(){
        ultimo=null;
    }
    
    //lista vacia
    public boolean estaVacia(){
        return ultimo==null;
        
    }
    
    //insertar
    public Lista insertar (int elemento){
        Nodo nuevo= new Nodo (elemento);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    
    //mostrar
    public void mostrar(){
        Nodo auxiliar= ultimo.siguiente;
        String resultado="";
        do{
            resultado=resultado+"["+auxiliar.dato+"]--->";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null, resultado, "Mostar los nodos de la lista", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //eliminar
    public boolean eliminar(int elemento){
        Nodo actual;
        boolean encontrado=false;
        actual=ultimo;
        while(actual.siguiente!=ultimo&&!encontrado){
            encontrado=(actual.siguiente.dato==elemento);
            if(!encontrado){
                actual=actual.siguiente;
            }
        }
        encontrado=(actual.siguiente.dato==elemento);
        if(encontrado){
            Nodo auxiliar=actual.siguiente;
            if(ultimo==ultimo.siguiente){
                ultimo=null;
            }else {
                if(auxiliar==ultimo){
                    ultimo=actual;
                }
                actual.siguiente=auxiliar.siguiente;
            }
            auxiliar=null;
        }
        return encontrado==true;
    }
}

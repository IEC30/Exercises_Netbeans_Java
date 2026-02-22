/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Operaciones {
    private Nodo UltimoValor;
    int tamaño = 0;
    String Lista = "";
    
    public Operaciones(){
        UltimoValor = null;
        tamaño = 0;
    }
    
    // preguntar si la estructura esta vacia
    public boolean EsVacia(){
        return UltimoValor == null;
    }
    
    // insertar nodos
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValor;
        UltimoValor = nuevo_nodo;
        tamaño++;
    }
    
    // eliminar nodos
    public int EliminarNodo(){
        int neliminado = UltimoValor.informacion;
        UltimoValor = UltimoValor.siguiente;
        tamaño--;
        return neliminado;
    }
    
    // mostrar ultimo valor
    public int MostrarUltimoValor(){
        return UltimoValor.informacion;
    }
    
    // mostrar tamañor
    public int Tamaño_E(){
        return tamaño;
    }
    
    //vacias lista
    public void VaciarEstructura(){
        while (!EsVacia()){
            EliminarNodo();
        }
    }
    
    // mostrar contenido
    public void MostrarContenido(){
        Nodo recorrido = UltimoValor;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
    JOptionPane.showMessageDialog(null, Lista);
    
    Lista = "";
    }
}

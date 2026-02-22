/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

    public class Operaciones {
        private Nodo UltimoValor;
        int tamaño = 0;
        String Lista = "";

        public Operaciones(){
            UltimoValor = null;
            tamaño = 0;
    }
    

    public boolean EsVacia(){
        return UltimoValor == null;
    }
    

        public void InsertarNodo(double nodo){
            Nodo nuevo_nodo = new Nodo(nodo);
            nuevo_nodo.siguiente = UltimoValor;
            UltimoValor = nuevo_nodo;
            tamaño++;
    }
    

    public double EliminarNodo(){
            double neliminado = UltimoValor.informacion;
            UltimoValor = UltimoValor.siguiente;
            tamaño--;
            return neliminado;
    }
    
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

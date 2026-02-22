/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

public class Cola {
    private Nodo inicioCola, fincola;
    String cola="";
    int tamaño;
    
    public Cola(){
        
        inicioCola=null;
        fincola=null;
        tamaño=0;
        }
    
    public boolean ColaVacia()
    {
      if(inicioCola==null)
        {
          return true;
        }else
        {
          return false;
        }
    }
    
    public void Encolar(double informacion)
    {
      Nodo nuevo_nodo= new Nodo();
      nuevo_nodo.informacion= informacion;
      nuevo_nodo.siguiente= null;
       
      if (ColaVacia())
              {
                inicioCola= nuevo_nodo;
                fincola= nuevo_nodo;
                }else
      {
        fincola.siguiente= nuevo_nodo;
        fincola= nuevo_nodo;
        }
        tamaño++;
    }
    
    public double Desencolar()
            {
        if(!ColaVacia())
               {
            double informacion=inicioCola.informacion;
            if(inicioCola==fincola)
            {
             inicioCola=null;
             fincola=null;
            }else
            {
             inicioCola=inicioCola.siguiente;
            }
            tamaño--;
            return informacion;
            }else
            {
                return Integer.MAX_VALUE;
            }
        }
    
        public int TamañoCola()
        {
            return tamaño;
                }

        public void MostrarContenido()
        {
            Nodo recorrido=inicioCola;
            String ColaInvertida="";
            while(recorrido !=null)
            {
                cola +=recorrido.informacion+"";
                recorrido=recorrido.siguiente;
            }
            String cadena[]=cola.split("");
            for(int i=cadena.length -1 ; i>=0; i--)
            {
                ColaInvertida +=" "+cadena[i];
            }
            JOptionPane.showMessageDialog(null, ColaInvertida);
            cola="";
        }
}

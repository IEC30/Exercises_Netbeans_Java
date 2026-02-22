/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int operacion=0, nodo_informacion=0;
        Cola cola= new Cola();
        do{
            try{
                
                operacion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de operaciones\n\n"
                +"1. Insertar un nodo\n"
                +"2. Extraer un nodo\n"
                +"3. Mostrar contenido de la cola\n"
                +"4. Mostrar tamaño de la cola\n"
                +"5. Salir\n\n"));
                
                switch (operacion){
                    case 1: 
                        nodo_informacion=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor ingresa el valor a guardar en el nodo"));
                        cola.Encolar(nodo_informacion);
                        break;
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor:"
                            + cola.Desencolar());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }
                        break;
                        
                    case 3:
                        cola.MostrarContenido();
                        break;
                    
                    case 4:
                        JOptionPane.showMessageDialog(null, "El tamaño de la cola es"
                        + cola.TamañoCola());
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible.");
                        break;
                }
            }catch(NumberFormatException e){
                
            }
        }while(operacion!=5);
    }
    
}

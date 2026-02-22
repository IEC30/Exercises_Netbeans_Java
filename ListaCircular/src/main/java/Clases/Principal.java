/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        int opcion = 0,elemento;
        boolean eliminar=false;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.- Agregar un nodo a la lista circular\n"
                +"2.- Eliminar un nodo de la lista\n"
                +"3.- Mostrar la lista\n"
                +"4.- Salir\n"
                + "opciones", JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el elemento del nodo",
                                "Agregando nodo a la lista",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.insertar(elemento);
                        break;
                    case 2:
                        if(!lista.estaVacia()){
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento del nodo a eliminar ", "Eliminado valor de la lista",
                                    JOptionPane.INFORMATION_MESSAGE ));
                            eliminar=lista.eliminar(elemento);
                            if (eliminar){
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+elemento,
                                        "Nodo eliminado",JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "El elemento "+elemento+"No esta en la lista",
                                        "Elemento no encontrando", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!lista.estaVacia()){
                            lista.mostrar();
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Fin de la aplicación",
                                "Adios", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error"+n.getMessage());
            }
        }while(opcion !=4);
    }
    
}

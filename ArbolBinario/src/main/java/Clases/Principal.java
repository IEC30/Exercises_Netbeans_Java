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
        int opcion=0,elemento;
        String nombre;
        ArbolBinario AB= new ArbolBinario();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1.- Agregar nodo \n"
                +"2.- Recorrer inOrde \n"
                +"3.- Recorrer preOrden \n"
                +"4.- Recorrer postOrden \n"
                +"5.- Buscar nodo \n"
                +"6.- Eliminar nodo \n"
                +"7.- Salir \n"
                +"Elige una opcion","Arboles Binarios"
                ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresar el valor del nodo ", "Agregando nodo"
                        ,JOptionPane.QUESTION_MESSAGE));
                        nombre=JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del nodo","Agregando nodo"
                        ,JOptionPane.QUESTION_MESSAGE);
                        AB.agregarNodo(elemento, nombre);
                        break;
                        
                    case 2:
                        if(!AB.estaVacio()){
                            System.out.println();
                            AB.inOrden(AB.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "El arbol esta vacio","Operacion no realizada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 3:
                        if(!AB.estaVacio()){
                            System.out.println();
                            AB.preOrden(AB.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "El arbol está vacio","Operacion no realizada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if(!AB.estaVacio()){
                            System.out.println();
                            AB.postOrden(AB.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "El arbol está vacio","Operacion no realizada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        if(!AB.estaVacio()){
                            //AB.postOrden(AB.raiz);
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el valor del nodo a buscar ","Buscando nodo"
                            ,JOptionPane.QUESTION_MESSAGE));
                            
                            if(AB.buscarNodo(elemento)==null){
                                JOptionPane.showMessageDialog(null,
                                        "El nodo no se encuentra en el arbol",
                                        "Nodo no encontrado",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                System.out.println("Nodo encontrado: "+AB.buscarNodo(elemento));
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "El arbol está vacio","Operacion no realizada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                        
                    case 6:
                        if(!AB.estaVacio()){
                            elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresar el valor del nodo a eliminar","Eliminando nodo"
                            ,JOptionPane.QUESTION_MESSAGE));
                            
                            if(AB.eliminar(elemento)==false){
                                JOptionPane.showMessageDialog(null,
                                        "El nodo no se encuentra en el arbol",
                                        "Nodo no encontrado",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "El nodo ha sido eliminado",
                                        "Nodo eliminado",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "El arbol está vacio","Operación no realizada",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 7: JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                            "Adios", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Escribe alguna opcion correcta",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
            }
        }while(opcion!=7);
    }
    
}

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
        int opcion=0,elemento=0;
        Pila pil = new Pila();
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. -Insertar elemento en la pila \n"
                +"2. -Obtener un elemento de la pila \n"
                +"3. -¿La pila esta vacia? \n"
                +"4. -Mostrar la cima \n"
                +"5. -Tamaño de la pila \n"
                +"6. -Vaciar la pila \n"
                +"7. -Salir \n"
                +"Elige tu opción", "Menu de opciones",
                JOptionPane.INFORMATION_MESSAGE
                ));
        switch(opcion){
                case 1:
                elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escribe el elemento a insertar en la pila", "Apilando datos",
                        JOptionPane.INFORMATION_MESSAGE));
                pil.push(elemento);
                break;
                
                case 2:
                if (!pil.estaVacia()) {
                JOptionPane.showMessageDialog(null, "El elemento obtenido es"
                + pil.pop(),
                "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null,
                    "La pila esta vacia",
                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                
                case 3:
                if(pil.estaVacia()) {
                JOptionPane.showMessageDialog(null, "La pila esta vacia",
                "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                }else{
                JOptionPane.showMessageDialog(null,
                "La pila no esta vacia",
                "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                
                case 4:
                if (!pil.estaVacia()) {
                JOptionPane.showMessageDialog(null, "El elemento que esta en la cima es " +pil.cima(),
                
                "Mostrando cima", JOptionPane.INFORMATION_MESSAGE);
                }else {
                JOptionPane.showMessageDialog(null,
                "La pila esta vacia",
                "Pila vacia",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                
                case 5:
                JOptionPane.showMessageDialog(null,
                "El tamaño de la pila es "+pil.tamañoPila(),
                "Tamaño de la pila es", JOptionPane.INFORMATION_MESSAGE);
                break;
                
                case 6:
                if(!pil.estaVacia()) {
                pil.vaciarPila();
                JOptionPane.showMessageDialog(null,
                "La pila se ha vaciado",
                "Vaciar pila", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,
                "La pila ya esta vacia . . .",
                "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
            }
            break;
            
            case 7:
            JOptionPane.showMessageDialog(null, 
            "Fin de la aplicacion",
            "Adios . . .", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
            }catch(NumberFormatException n){
           }
        }while(opcion != 7);
}

}
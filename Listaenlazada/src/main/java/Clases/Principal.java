/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int operacion = 0; 
        double nodo = 0;
        Operaciones opt = new Operaciones();
        do {
            try {
                
                operacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Operaciones a realizar \n\n"
                + "1. Insertar un nodo \n"
                + "2. Mostrar contenido \n"               
                + "3. Eliminar un nodo \n"
                + "4. Salir. \n\n"));
                
            switch (operacion){
                case 1:
                    nodo =Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingresa el valor a guardar en el nodo"));
                    opt.InsertarNodo(nodo);
                    break;
                    
                    case 2:
                        opt.MostrarContenido();
                        break;
                    
                        case 3:
                            if (!opt.EsVacia()){
                                JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                + opt.EliminarNodo());
                            }else {
                                JOptionPane.showMessageDialog(null, "Ls lista esta vacia.");
                            }
                            break;

                                case 4:
                                    operacion = 4;
                                    break;                    
                        }

                        } catch (NumberFormatException e){

                        }
                    } while (operacion != 4);
            }
    
}

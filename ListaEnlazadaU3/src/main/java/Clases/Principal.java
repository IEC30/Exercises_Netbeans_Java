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
       
        int operacion = 0, nodo = 0;
        Operaciones opt = new Operaciones();
        
        do {
            try {
                
                operacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Operaciones a realizar \n\n"
                + "1. Insertar un nodo \n"
                + "2. Eliminar un nodo \n"
                + "3. ¿La lista esta vacia? \n"
                + "4. ¿Cual es el ultimo valor en la lista? \n"
                + "5. ¿Cuantos nodos tiene la lista? \n"
                + "6. Vaciar la lista \n"
                + "7. Mostrar contenido \n"
                + "8. Salir. \n\n"));
                
            switch (operacion) {
                case 1:
                    nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Por favor ingresa el valor a guardar en el nodo"));
                    opt.InsertarNodo(nodo);
                    break;
                case 2:
                    if (!opt.EsVacia()){
                        JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                        + opt.EliminarNodo());
                    }else {
                        JOptionPane.showMessageDialog(null, "Ls lista esta vacia.");
                    }
                    break;
                case 3:
                    if(opt.EsVacia()){
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    }else {
                        JOptionPane.showMessageDialog(null, "La lista contiene valores");
                    }
                    break;
                case 4:
                    if(!opt.EsVacia()){
                        JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: "
                                + opt.MostrarUltimoValor());
                    }else {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    }
                    break;                    
                case 5:
                    JOptionPane.showMessageDialog(null, "La lista contiene " + opt.Tamaño_E()+ " nodos.");
                    break;
                case 6:
                    if(!opt.EsVacia()){
                        opt.VaciarEstructura();
                        JOptionPane.showMessageDialog(null, "Se ha vaciado la lista correctamente");
                    }else {
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    }
                    break;
                case 7:
                    opt.MostrarContenido();
                    break;
                case 8:
                    operacion = 8;
                    break;                    
            }
                        
            } catch (NumberFormatException e){
                
            }
        } while (operacion != 8);
    }
    
}

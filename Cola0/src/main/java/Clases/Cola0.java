/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author HP
 */
public class Cola0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList();
        
        cola.offer(89);
        cola.add(1);
        cola.offer(489);
        cola.add(02);
        cola.offer(23);
        System.out.println("Cola llena: " + cola);
        cola.size();
        while(cola.poll()!=null) {
            System.out.println(cola.peek());
        }
        System.out.println(cola.peek());
    }
    
}

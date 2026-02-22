/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadenumerosintu3;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ListadeNumerosINTU3 {

    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los numeros a sumar");
        int numeros=0;
        do{
            try{
                numeros=sc.nextInt();
                lista.add(numeros);
            }
        catch(InputMismatchException ime){
                System.out.println("tipo de dato incorrecto");
                sc.next();
            }
    }while(numeros!=0);
    
    int suma=0;
    for(int num:lista){
    suma +=num;
}
    System.out.println("La suma de los numeros es"+suma);
    sc.close();        
    }
}

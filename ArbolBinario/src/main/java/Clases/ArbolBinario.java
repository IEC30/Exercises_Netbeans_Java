/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author HP
 */
public class ArbolBinario {
    Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    // Insertar
    public void agregarNodo(int d, String nom){
        Nodo nuevo=new Nodo(d, nom);
        if(raiz==null){
            raiz=nuevo;
        }else {
            Nodo auxiliar=raiz;
            Nodo padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoizquierdo;
                    if(auxiliar==null){
                        padre.hijoizquierdo=nuevo;
                        return;
                    }
                }else {
                    auxiliar=auxiliar.hijoderecho;
                    if(auxiliar==null){
                        padre.hijoderecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    // Esta vacio?
    public boolean estaVacio(){
        return raiz==null;
    }
    // Recorrer arbol inOrden
    public void inOrden(Nodo r){
        if(r!=null){
            inOrden(r.hijoizquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoderecho);
        }
    }
    // Recorrer arbol preOrden
    public void preOrden(Nodo r){
        if(r!=null){
            System.out.println(r.dato);
            preOrden(r.hijoizquierdo);
            preOrden(r.hijoderecho);
        }
    }
    // Recorrer arbol postOrden
    public void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.hijoizquierdo);
            postOrden(r.hijoderecho);
            System.out.println(r.dato);
        }
    }
    // Buscar nodo
    public Nodo buscarNodo(int d){
        Nodo aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoizquierdo;
            }else{
                aux=aux.hijoderecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    // Eliminar nodo
    public boolean eliminar(int d){
        Nodo auxiliar = raiz;
        Nodo padre=raiz;
        boolean esHijoI=true;
        while(auxiliar.dato!=d){
            padre=auxiliar;
            if(d<auxiliar.dato){
                esHijoI=true;
                auxiliar=auxiliar.hijoizquierdo;
            }else {
                esHijoI=false;
                auxiliar=auxiliar.hijoderecho;
            }
            if(auxiliar==null){
                return false;
            }
        }// Fin while
        if(auxiliar.hijoizquierdo==null&&auxiliar.hijoderecho==null){
            if(auxiliar==raiz){
                raiz=null;
            }else if (esHijoI){
                padre.hijoizquierdo=null;
            }else{
                padre.hijoderecho=null;
            }
        }else if(auxiliar.hijoderecho==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoizquierdo;
            }else if (esHijoI){
                padre.hijoizquierdo=auxiliar.hijoizquierdo;
            }else{
                padre.hijoderecho=auxiliar.hijoizquierdo;
            }
        }else if(auxiliar.hijoderecho==null){
            if(auxiliar==raiz){
                raiz=auxiliar.hijoderecho;
            }else if (esHijoI){
                padre.hijoizquierdo=auxiliar.hijoderecho;
            }else{
                padre.hijoderecho=auxiliar.hijoizquierdo;
            }
        }else{
            Nodo reemplazo=obtenerNodoReemplazo(auxiliar);
            if(auxiliar==raiz){
                raiz=reemplazo;
            }else if (esHijoI){
                padre.hijoizquierdo=reemplazo;
            }else{
                padre.hijoderecho=reemplazo;
            }
            reemplazo.hijoizquierdo=auxiliar.hijoizquierdo;
        }
        return true;
    }
    // Devolver nodo reemplazo
    public Nodo obtenerNodoReemplazo(Nodo nodoRem){
        Nodo reemplazarPadre=nodoRem;
        Nodo reemplazo=nodoRem;
        Nodo auxiliar=nodoRem.hijoderecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoizquierdo;
        }
        if(reemplazo!=nodoRem.hijoderecho){
            reemplazarPadre.hijoizquierdo=reemplazo.hijoderecho;
            reemplazo.hijoderecho=nodoRem.hijoderecho;
        }
        System.out.println("El nodo reemplazo es" +reemplazo);
        return reemplazo;
    }
}

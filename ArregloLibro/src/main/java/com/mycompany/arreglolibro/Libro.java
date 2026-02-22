/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglolibro;

public class Libro {
    private int id;
    private String autor;
    private String titulo;
    private String editorial;
    private int paginas;

    public Libro(int id, String autor, String titulo, String editorial, int paginas) {
        this.id= id;
        this.autor= autor;
        this.titulo= titulo;
        this.editorial= editorial;
        this.paginas= paginas;
    }

    @Override
    public String toString() {
        return "Id: "+id +"\nAutor: "+autor+"\nTítulo: "+titulo+"\nEditorial: "+editorial+"\nPáginas: "+paginas+"\n";
    }
}
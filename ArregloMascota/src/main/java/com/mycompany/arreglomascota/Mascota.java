/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglomascota;

public class Mascota 
{
    private int id;
    private String nombre;
    private String raza;
    private String color;
    private String tipo;

    public Mascota(int id,String nombre,String raza,String color,String tipo)
    {
        this.id= id;
        this.nombre= nombre;
        this.raza= raza;
        this.color= color;
        this.tipo= tipo;
    }

    @Override
    public String toString() {
    return "Id: " +id+"\nNombre: "+nombre+"\nraza: "+raza+"\ncolor: "+color+"\ntipo: "+tipo+"\n";
    }
}

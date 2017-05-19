/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick_martinez_examen;

/**
 *
 * @author usuario
 */
public class Archivo {
    public String nombre;
    public int tamano;

    public Archivo() {
    }

    public Archivo(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", tamano=" + tamano + '}';
    }
    
}

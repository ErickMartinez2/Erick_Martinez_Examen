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
public class Archivo_Texto extends Archivo {

    public String contenido;

    public Archivo_Texto() {
        super();
    }

    public Archivo_Texto(String contenido, String nombre, int tamano) {
        super(nombre, tamano);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Archivo_Texto{" + "contenido=" + contenido + '}';
    }
    
}

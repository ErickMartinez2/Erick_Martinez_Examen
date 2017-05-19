/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick_martinez_examen;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Carpeta extends Archivo {
    
    static ArrayList<Archivo> archivo = new ArrayList();
    
    public Carpeta() {
        super();
    }

    public Carpeta(String nombre, int tamano) {
        super(nombre, tamano);
    }

    public static ArrayList<Archivo> getArchivo() {
        return archivo;
    }

    public static void setArchivo(ArrayList<Archivo> archivo) {
        Carpeta.archivo = archivo;
    }
    
}
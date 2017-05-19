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
public class Proyecto {
    public String nombre;
    public ArrayList<Usuario> colaboradores = new ArrayList();
    public ArrayList<Archivo> archivos = new ArrayList();
    public int commits;

    public Proyecto() {
    }

    public Proyecto(String nombre, int commits) {
        this.nombre = nombre;
        this.commits = commits;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList colaboradores) {
        this.colaboradores = colaboradores;
    }

    public ArrayList getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList archivos) {
        this.archivos = archivos;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", colaboradores=" + colaboradores + ", archivos=" + archivos + ", commits=" + commits + '}';
    }
    
}

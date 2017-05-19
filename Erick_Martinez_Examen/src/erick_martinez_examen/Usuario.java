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
public class Usuario {
    public String nombre;
    public int edad;
    public String profesion;
    public String username;
    public String password;
    public ArrayList<Proyecto> proyecto = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String profesion, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", username=" + username + ", password=" + password + '}';
    }
    
}
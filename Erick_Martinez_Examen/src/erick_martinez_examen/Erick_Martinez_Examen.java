/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erick_martinez_examen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Erick_Martinez_Examen {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Usuario> usuario = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("*** GitHub ***");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Modificar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Listar Usuarios");
            System.out.println("5. Iniciar Sesión");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("-> Registrar Usuario:");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Ingrese la profesion: ");
                    String profesion = sc.next();
                    System.out.print("Ingrese el nombre del usuario: ");
                    String username = sc.next();
                    System.out.print("Ingrese la contraseña: ");
                    String password = sc.next();
                    Usuario u = new Usuario(nombre, edad, profesion, username, password);
                    usuario.add(u);
                    System.out.println("Usuario Registrado!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-> Modificar Usuario");
                    for (int i = 0; i < usuario.size(); i++) {
                        System.out.println(i + ". " + usuario.get(i));
                    }
                    System.out.print("Ingrese el numero del usuario: ");
                    int num_usuario = sc.nextInt();
                    System.out.println();
                    System.out.println("-> Modificación");
                    System.out.println("1. Nombre de Usuario");
                    System.out.println("2. Contraseña");
                    System.out.print("Ingrese su opcion: ");
                    int num_mod = sc.nextInt();
                    System.out.println();
                    switch (num_mod) {
                        case 1:
                            System.out.print("Ingrese el nombre del usuario: ");
                            String username2 = sc.next();
                            usuario.get(num_usuario).setUsername(username2);
                            break;
                        case 2:
                            System.out.print("Ingrese la contraseña: ");
                            String password2 = sc.next();
                            usuario.get(num_usuario).setPassword(password2);
                            break;
                    }
                    System.out.println("Usuario Modificado!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-> Eliminar Usuario");
                    for (int i = 0; i < usuario.size(); i++) {
                        System.out.println(i + ". " + usuario.get(i));
                    }
                    System.out.print("Ingrese el numero del usuario: ");
                    int num_usuario2 = sc.nextInt();
                    usuario.remove(num_usuario2);
                    System.out.println("Usuario Eliminado!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("-> Listar Usuarios");
                    for (int i = 0; i < usuario.size(); i++) {
                        System.out.println("- " + usuario.get(i));
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("-> Iniciar Sesion: ");
                    System.out.print("Ingrese su usuario: ");
                    String Username = sc.next();
                    System.out.print("Ingrese la contraseña: ");
                    String Password = sc.next();
                    boolean correcto = false;
                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getUsername().equals(Username)) {
                            if (usuario.get(i).getPassword().equals(Password)) {
                                correcto = true;
                            }
                        }
                    }
                    if (correcto == false) {
                        System.out.println("El usuario o la contraseña son incorrectos!");
                        System.out.println();
                    } else {
                        System.out.println();
                        Iniciar(Username);
                    }
                    System.out.println();
                    break;
            }
        } while (opcion != 6);
    }
    
    public static void Iniciar(String username){
        System.out.println("*** GitHub ***");
        System.out.println("-> Proyectos");
        
    }

}

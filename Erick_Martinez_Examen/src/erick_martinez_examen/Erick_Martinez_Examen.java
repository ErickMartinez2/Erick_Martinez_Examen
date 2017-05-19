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
                    if (!usuario.isEmpty()) {
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
                    } else {
                        System.out.println("No hay usuarios que modificar!");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (!usuario.isEmpty()) {
                        System.out.println("-> Eliminar Usuario");
                        for (int i = 0; i < usuario.size(); i++) {
                            System.out.println(i + ". " + usuario.get(i));
                        }
                        System.out.print("Ingrese el numero del usuario: ");
                        int num_usuario2 = sc.nextInt();
                        usuario.remove(num_usuario2);
                        System.out.println("Usuario Eliminado!");
                    } else {
                        System.out.println("No hay usuarios que eliminar!");
                    }
                    System.out.println();
                    break;
                case 4:
                    if (!usuario.isEmpty()) {
                        System.out.println("-> Listar Usuarios");
                        for (int i = 0; i < usuario.size(); i++) {
                            System.out.println("- " + usuario.get(i));
                        }
                    } else {
                        System.out.println("No hay usuarios que listar!");
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
                    int num = -1;
                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).getUsername().equals(Username)) {
                            if (usuario.get(i).getPassword().equals(Password)) {
                                correcto = true;
                                num = i;
                            }
                        }
                    }
                    if (correcto == false) {
                        System.out.println("El usuario o la contraseña son incorrectos!");
                    } else {
                        System.out.println();
                        Iniciar(Username, num);
                    }
                    System.out.println();
                    break;
            }
        } while (opcion != 6);
    }

    public static void Iniciar(String username, int num) {
        int opcion2;
        do {
            System.out.println("*** GitHub ***");
            System.out.println("-> Proyectos");
            if (!usuario.get(num).getProyecto().isEmpty()) {
                for (int i = 0; i < usuario.get(num).getProyecto().size(); i++) {
                    System.out.println(i + ". " + usuario.get(num).getProyecto().get(i));
                }
            } else {
                System.out.println("No hay proyectos creados!");
            }
            System.out.println();
            System.out.println("1. Crear Proyecto");
            System.out.println("2. Modificar Proyecto");
            System.out.println("3. Eliminar Proyecto");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion2 = sc.nextInt();
            System.out.println();
            switch (opcion2) {
                case 1:
                    System.out.println("-> Crear Proyecto");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc.next();
                    Proyecto p = new Proyecto(nombre, 0);
                    usuario.get(num).getProyecto().add(p);
                    System.out.print("Desea agregar colaboradores? [s/n]: ");
                    char resp = sc.next().charAt(0);
                    ArrayList<Integer> colaborar = new ArrayList();
                    if (resp == 's' || resp == 'S') {
                        char resp2;
                        do {
                            System.out.println("-> Usuarios");
                            for (int i = 0; i < usuario.size(); i++) {
                                for (int j = 0; j < colaborar.size(); j++) {
                                    if (i != colaborar.get(i)) {
                                        System.out.println(i + ". " + usuario.get(i));
                                    }
                                }
                            }
                            System.out.print("Ingrese el numero del usuario: ");
                            int num_usuario = sc.nextInt();
                            colaborar.add(num_usuario);
                            usuario.get(num).getProyecto().get(usuario.get(num).getProyecto().size() - 1).getColaboradores().add(usuario.get(num_usuario));
                            usuario.get(num_usuario).getProyecto().add(p);
                            System.out.print("Desea agregar otro colaborador? [s/n]: ");
                            resp2 = sc.next().charAt(0);
                        } while (resp2 == 's' || resp2 == 'S');
                    }
                    System.out.println("Proyecto Creado!");
                    System.out.println();
                    break;
                case 2:
                    if (!usuario.get(num).getProyecto().isEmpty()) {
                        System.out.println("-> Modificar Proyecto");
                        System.out.print("Ingrese el numero del proyecto: ");
                        int num_proyecto = sc.nextInt();
                        System.out.println();
                        System.out.println("-> Archivos");
                        for (int i = 0; i < usuario.get(num).getProyecto().get(num_proyecto).getArchivos().size(); i++) {
                            System.out.println(i + ". " + usuario.get(num).getProyecto().get(num_proyecto).getArchivos().get(i));
                        }
                        System.out.println();
                        System.out.println("1. Crear Archivo");
                        System.out.println("2. Modificar Archivo");
                        System.out.println("3. Eliminar Archivo");
                        System.out.println("4. Ingresar Comando");
                        System.out.println("5. Volver");
                        System.out.print("Ingrese su opcion: ");
                        int opcion3 = sc.nextInt();
                        System.out.println();
                        switch (opcion3) {
                            case 1:
                                System.out.println("-> Crear Archivo");
                                System.out.print("Ingrese el nombre: ");
                                String Nombre = sc.next();
                                System.out.print("Ingrese el tamaño: ");
                                int Tamano = sc.nextInt();
                                System.out.println();
                                System.out.println("-> Tipos de Archivos");
                                System.out.println("1. Carpeta");
                                System.out.println("2. Archivos de Texto");
                                System.out.print("Ingrese su opcion: ");
                                int opcion4 = sc.nextInt();
                                switch (opcion4) {
                                    case 1:
                                        Archivo ac = new Carpeta(Nombre, Tamano);
                                        System.out.println("Carpeta Agregada!");
                                        System.out.println();
                                        break;
                                    case 2:
                                        System.out.println();
                                        System.out.println("Ingrese el contenido del archivo de texto: ");
                                        String contenido = sc.next();
                                        Archivo at = new Archivo_Texto(contenido, Nombre, Tamano);
                                        System.out.println("Archivo de Texto Agregado!");
                                        System.out.println();
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("-> Modificar Archivo");
                                System.out.print("Ingrese el nombre del archivo: ");
                                int num_archivo = sc.nextInt();
                                if (usuario.get(num).getProyecto().get(num_proyecto).getArchivos().get(num_archivo) instanceof Carpeta) {

                                } else {
                                    if (usuario.get(num).getProyecto().get(num_proyecto).getArchivos().get(num_archivo) instanceof Archivo_Texto) {

                                    }
                                }
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("-> Eliminar Archivo");
                                System.out.print("Ingrese el nombre del archivo: ");
                                int num_archivo2 = sc.nextInt();
                                usuario.get(num).getProyecto().get(num_proyecto).getArchivos().remove(num_archivo2);
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("-> Comando");
                                System.out.print("Ingrese el comando: ");
                                sc.nextLine();
                                String comando = sc.nextLine();
                                if (comando.equals("meow push")) {
                                    int Num = usuario.get(num).getProyecto().get(num_proyecto).getCommits();
                                    usuario.get(num).getProyecto().get(num_proyecto).setCommits(Num++);
                                    for (int i = 0; i < usuario.get(num).getProyecto().get(num_proyecto).getColaboradores().size(); i++) {
                                        for (int j = 0; j < ((Usuario) usuario.get(num).getProyecto().get(num_proyecto).getColaboradores().get(i)).getProyecto().size(); j++) {
                                            if (((Usuario) usuario.get(num).getProyecto().get(num_proyecto).getColaboradores().get(i)).getProyecto().get(j).getNombre().equals(usuario.get(num).getProyecto().get(num_proyecto).getNombre())) {
                                                ((Usuario) usuario.get(num).getProyecto().get(num_proyecto).getColaboradores().get(i)).setProyecto(usuario.get(num).getProyecto());
                                                System.out.println("Push Completado!");
                                            }
                                        }
                                    }
                                }
                                System.out.println();
                                break;
                        }
                    } else {
                        System.out.println("No hay proyectos que modificar!");
                        System.out.println();
                    }
                    break;
                case 3:
                    if (!usuario.get(num).getProyecto().isEmpty()) {
                        System.out.println("-> Eliminar Proyecto");
                        System.out.print("Ingrese el numero del proyecto: ");
                        int num_proyecto = sc.nextInt();
                        usuario.get(num).getProyecto().remove(num_proyecto);
                    } else {
                        System.out.println("No hay proyectos que eliminar!");
                    }
                    break;
            }
        } while (opcion2 != 4);
    }
}
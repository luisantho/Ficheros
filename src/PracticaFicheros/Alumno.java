/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFicheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Alumno implements Serializable {

    //Atributos
    private int carnet;
    private String nombre;
    private String apellidos;
    private double nota1, nota2, nota3;

    //Constructor
    public Alumno(int carnet, String nombre, String apellidos, double nota1, double nota2, double nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //Constructor vacio 
    public Alumno() {
    }

    //Setters
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    //Getters

    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    //ToString
    @Override
    public String toString() {
        return "Alumno " + "carnet:" + carnet + ", nombre:" + nombre + ", apellidos:" + apellidos + ", nota1:" + nota1 + ", nota2:" + nota2 + ", nota3:" + nota3;
    }

    //Metodo ponerDatos
    public static void ponerDatos(ArrayList<Alumno> lista) {
        Scanner tcl = new Scanner(System.in);
        boolean erroneo;

        do {
            erroneo = true;

            try {
                System.out.println("=====Introducir datos=====");
                System.out.println("");

                System.out.println("Introduce tu numero de carnet:");
                int carnet = tcl.nextInt();
                tcl.nextLine();
                System.out.println("Introduce tu nombre:");
                String nombre = tcl.nextLine();

                System.out.println("Introduce tus apellidos:");
                String apellidos = tcl.nextLine();

                System.out.println("Introduce tu nota 1:");
                int nota1 = tcl.nextInt();

                System.out.println("Introduce tu nota 2:");
                int nota2 = tcl.nextInt();

                System.out.println("Introduce tu nota 3:");
                int nota3 = tcl.nextInt();

                Alumno a = new Alumno(carnet, nombre, apellidos, nota1, nota2, nota3);
                lista.add(a);
                System.out.println("Alumno añadido con exito");

                erroneo = false;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (erroneo);
    }

    //Metodo llenar Archivo
    public static void llenarArchivo(ArrayList<Alumno> lista) {

        ObjectOutputStream ost;
        try {
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("alumnos.dat")));
            ost.writeObject(lista);
            ost.close();
            System.out.println("Alumnos guardados con exito");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo pasarALista
    public static void pasarALista(ArrayList<Alumno> lista) {

        ObjectInputStream ist;
        try {
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("alumnos.dat")));
            Alumno alumno = (Alumno) ist.readObject();
            lista.add(alumno);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo Buscar por nombre
    public static void buscar(ArrayList<Alumno> lista) {
        Scanner tcl = new Scanner(System.in);
        boolean erroneo;

        do {
            erroneo = true;
            try {
                System.out.println("=====Buscar=====");
                System.out.println("Introduce el nombre:");
                String nom = tcl.nextLine();
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).nombre.equals(nom)) {
                        System.out.println(lista.get(i).toString());
                    }

                }
                erroneo = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (erroneo);
    }

    //Metodo borrar Alunmo
    public static void borrar(ArrayList<Alumno> lista) {
        Scanner tcl = new Scanner(System.in);
        boolean erroneo;
        do {
            erroneo = true;
            try {
                System.out.println("=====Borrar Alumno=====");
                System.out.println("Introduce el carnet del alumno");
                int carnet = tcl.nextInt();

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).carnet == carnet) {
                        lista.remove(i);
                        System.out.println("Alumno eliminado con exito");
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (erroneo);
    }

    //Metodo para modificar
    public static void modificar(ArrayList<Alumno> lista) {
        Scanner tcl = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=====Modificar=====");
            System.out.println("1.Carnet");
            System.out.println("2.Nombre");
            System.out.println("3.Apellidos");
            System.out.println("4.Nota 1");
            System.out.println("5.Nota 2");
            System.out.println("6.Nota 3");
            System.out.println("0.Salir");
            opcion = tcl.nextInt();
            
            switch(opcion){
                     case 1:
            
                     break;
                     case 2:
                     
                     break;
            
            
            
            
        }
        } while (opcion != 0);
    }

}

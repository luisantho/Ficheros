/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFicheros;

import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author luibol
 */
public class GuardarAlumno {

    public static void main(String[] args) {
        
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        Scanner tcl = new Scanner(System.in);
        int opcion;

        //MENU
        do {
            System.out.println("=====MENU=====");
            System.out.println("1.Introducir datos");
            System.out.println("2.Buscar");
            System.out.println("3.Modificar");
            System.out.println("4.Borrar");
            System.out.println("5.Guardar aprobados");
            System.out.println("6.Visualizar aprobados");
            System.out.println("7.Guardar en alumnos.dat");
            System.out.println("0.Salir");
            opcion = tcl.nextInt();
            
            switch(opcion){
                //Todos los metodos son estaticos y no necesito una instacia
                case 1: 
                    Alumno.ponerDatos(listaAlumnos);
                    break;
                case 2:
                    Alumno.buscar(listaAlumnos);
                    break;
                case 3:
                    // Metodo 3
                    break;
                case 4:
                    Alumno.borrar(listaAlumnos);
                    break;
                case 5:
                    // Metodo 5
                    break;
                case 6:
                    // Metodo 6
                    break;
                case 7:
                    Alumno.llenarArchivo(listaAlumnos);
                    break;     
            }
        } while (opcion != 0);

    }

}

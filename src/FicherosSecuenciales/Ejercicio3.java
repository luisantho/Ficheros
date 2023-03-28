/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosSecuenciales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Ejercicio3 {

    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);

        //Parte Usuario
        System.out.println("Introduce el nombre del fichero nuevo:");
        String fichero2 = tcl.nextLine();
        System.out.println("Introduce el tamaño minimo para cada linea");
        int tamaño = tcl.nextInt();

        //
        String fhc1 = "fichero3-1.txt";
        String fch2 = fichero2;
        BufferedReader bw1 = null;
        BufferedWriter br2 = null;

        //
        try {

       // } catch (FileNotFoundException e) {
            System.out.println("Error, archivo no encontrado");
            //System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        } finally {
            try {

            } catch (Exception e) {

            }

        }

    }

}

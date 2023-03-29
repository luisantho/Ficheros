/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosSecuenciales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        //Parte Usuario
        System.out.println("Introduce el nombre del fichero nuevo:");
        String ficheronuevo = tcl.nextLine();
        System.out.println("Introduce el tamaño minimo para cada linea");
        int tamaño = tcl.nextInt();

        //
        String fhc1 = "fichero3-1.txt";
        String fch2 = ficheronuevo;
        BufferedReader bw1 = null;
        BufferedWriter br2 = null;

        //
        try {
            bw1 = new BufferedReader(new FileReader(fhc1));
            br2 = new BufferedWriter(new FileWriter(ficheronuevo));

            //Guardamos cada linea del fichero en un String
            String lin1 = bw1.readLine();
            //Mientras cada linea tenga contenido, se ejecutara lo de dentro
            while (lin1 != null) {

                if (lin1.length() >= tamaño) {
                    br2.write(lin1);
                    br2.newLine();
                }
                lin1 = bw1.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, archivo no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bw1 != null) {
                    bw1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
                System.out.println(e.getMessage());
            }

        }

    }
}
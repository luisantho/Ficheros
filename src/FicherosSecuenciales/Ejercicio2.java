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
import java.nio.Buffer;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        String fr1 = "fichero2-1.txt";
        String fr2 = "fichero2-2.txt";
        BufferedReader br1 = null, br2 = null;
        BufferedWriter bw = null;

        try {
            //Parte Usuario
            System.out.println("Introduce el nombre del fichero:");
            String ficherodestino = tcl.nextLine();
            System.out.println("Introduce la tira de separacion:");
            String sep = tcl.nextLine();
            br1 = new BufferedReader(new FileReader(fr1));
            br2 = new BufferedReader(new FileReader(fr2));
            bw = new BufferedWriter(new FileWriter(ficherodestino));

            //Parte Usuario
            String linea1 = br1.readLine();
            while (linea1 != null) {
                String linea2 = br2.readLine();
                while (linea2 != null) {
                    bw.write(linea1 + sep + linea2);
                    bw.newLine();
                    linea2 = br2.readLine();
                }
                br2.close();
                br2 = new BufferedReader(new FileReader(fr2));
                linea1 = br1.readLine();

            }

            System.out.println("Lineas combinadas perfectamente ");

        } catch (FileNotFoundException e) {
            System.out.println("Error, archivo no encontrado");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br1 != null || br2 != null || bw != null) {
                    br1.close();
                    br2.close();
                    bw.close();

                }

            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
                System.out.println(e.getMessage());

            }

        }

    }

}

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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String fr1 = "fichero1.txt";
        String fr2 = "fichero2.txt";
        BufferedReader br1 = null, br2 = null;
        BufferedWriter bw = null;

        try {
            System.out.println("Introduce el nombre del fichero");
            String ficherodestino = tcl.nextLine();
            br1 = new BufferedReader(new FileReader(fr1));
            br2 = new BufferedReader(new FileReader(fr2));
            bw = new BufferedWriter(new FileWriter(ficherodestino));

            //Leer las lineas de los dos archivos y combinarlas
            String linea1, linea2;
            while ((linea1 = br1.readLine()) != null && (linea2 = br2.readLine()) != null) {
                String lineaComb = linea1 + linea2;
                bw.write(lineaComb);
            }

            System.out.println("Archivos combinados correctamente");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
                if (bw != null) {
                    bw.close();
                }

            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }

        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosSecuenciales;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String fichero1 = "dni.txt";
        String fichero2 = "nif.txt";
        BufferedWriter bw = null, bw2 = null;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        //Parte Usuario
        System.out.println("Introduce un numero inicial");
        int ini = tcl.nextInt();
        System.out.println("Introduce un numero final");
        int fin = tcl.nextInt();
        char letra_nif;
        try {
            String dni;
            //Creamos el archivo dni.txt
            bw = new BufferedWriter(new FileWriter(fichero1));
            bw2 = new BufferedWriter(new FileWriter(fichero2));
            
            //Con este bucle recorremos los números entre el valor inicial y final
            for (int i = ini; i < fin; i++) {
                dni = String.valueOf(i);
                while(dni.length() < 8){
                    dni = 0 + dni;
                }
                 letra_nif = letras.charAt(Integer.parseInt(dni)%23);
                bw.write(dni);
                bw2.write(dni+ letra_nif);
                bw.newLine();
                bw2.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al encontrar el fichero");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(bw != null){
                    bw.close();
                }
                if(bw2 != null){
                    bw2.close();
                }

            } catch (Exception e) {
                System.out.println("Error al cerrar los ficheros");
                System.out.println(e.getMessage());
            }

        }

    }

}

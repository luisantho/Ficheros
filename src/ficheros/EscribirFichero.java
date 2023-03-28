/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.FileWriter;

/**
 *
 * @author luibol
 */
public class EscribirFichero {

    public static void main(String[] args) {
        String nuevo = "nuevo.txt";

        //
        FileWriter fw = null;

        try {
            fw = new FileWriter(nuevo);
            for (char c = 'A'; c <= 'Z'; c++) {
                fw.write(c);
               
            }

        } catch (Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());

        } finally {
            try {
                if (fw != null) {
                    fw.close();

                }

            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.toString());
            }

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author luibol
 */
public class Fichero21 {

    public static void main(String[] args) {
        String prueba = "prueba.txt";
        String texto = "Texto de prueba";
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(prueba,true));
            bw.write(texto);
            bw.newLine();

        } catch (Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());

        } finally {
            try {
                if(bw != null)
                    bw.close();

            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }

        }
    }

}

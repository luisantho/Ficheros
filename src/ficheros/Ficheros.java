/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author luibol
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String prueba = "prueba.txt";
        FileReader fr = new FileReader(prueba);
        BufferedReader br = new BufferedReader(fr);
        try {
            br = new BufferedReader(new FileReader(prueba));
            String texto = br.readLine();
            while (texto != null) {
                System.out.println(texto);

                texto = br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();

                }

            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }

        }

    }

}

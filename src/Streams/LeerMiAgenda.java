/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author luibol
 */
public class LeerMiAgenda {

    public static void main(String[] args) {
        String cadena = "fichero.txt";
        File f = new File(cadena);
        boolean fin = false;

        try {
            //miAgenda agenda = new miAgenda();
            FileInputStream ficha = new FileInputStream(f);
            BufferedInputStream b = new BufferedInputStream(ficha);
            ObjectInputStream d = new ObjectInputStream(b);

            do {
                miAgenda agenda = (miAgenda) d.readObject();
                System.out.println("\n\nRegistro");
                System.out.println("\nNombre :" + agenda.getNombre());
                System.out.println("\nDireccion :" + agenda.getDireccion());
                System.out.println("\nEmail :" + agenda.getEmail());
                for (int i = 0; i < agenda.getFono().size(); i++) {
                    System.out.println("\nTelefono:" + agenda.getFono().get(i));
                }

            } while (!fin);

        } catch (IOException i) {
            System.err.println(i);

        } catch (ClassNotFoundException e) {
            System.out.println("Error al encontrar el archivo");
            System.out.println(e.getMessage());
        }
    }

}

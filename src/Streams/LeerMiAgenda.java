/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.io.BufferedInputStream;
import java.io.EOFException;
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

    public static void main(String[] args) throws IOException {
        //String cadena = "fichero.txt";
        File f = new File("agenda.dat");
        boolean fin = false;
        FileInputStream ficha;
        ObjectInputStream d;
        BufferedInputStream b;
        miAgenda agenda;

        try {
            //miAgenda agenda = new miAgenda();
            ficha = new FileInputStream(f);
            b = new BufferedInputStream(ficha);
            d = new ObjectInputStream(b);
            agenda = new miAgenda();

            do {
                agenda = (miAgenda) d.readObject();
                System.out.println("\n\nRegistro");
                System.out.println("\nNombre :" + agenda.getNombre());
                System.out.println("\nDireccion :" + agenda.getDireccion());
                System.out.println("\nEmail :" + agenda.getEmail());
                for (int i = 0; i < agenda.getFono().size(); i++) {
                    System.out.println("\nTelefono:" + agenda.getFono().get(i));
                }

            } while (!fin);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (EOFException i) {
            System.err.println("Final de fichero");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al encontrar el archivo");
            System.out.println(e.getMessage());
        }
    }

}

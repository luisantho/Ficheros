/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class GuardarMiAgenda {

    public static void main(String[] args) {
        Scanner flujoEntrada = new Scanner(System.in);
        String cadena = "fichero.txt";
        File f = new File(cadena);
        String otro, fo, n, di, e;

        try {
            f.createNewFile();
            FileOutputStream ficha = new FileOutputStream(f);
            BufferedOutputStream b = new BufferedOutputStream(ficha);
            ObjectOutputStream d = new ObjectOutputStream(b);

            do {
                System.out.println("Introduce tu nombre:");
                n = flujoEntrada.nextLine();
                System.out.println("Introduce tu direccion:");
                di = flujoEntrada.nextLine();
                System.out.println("Introduce tu email:");
                e = flujoEntrada.nextLine();

                ArrayList lista = new ArrayList();
                do {
                    System.out.println("Telefono:");
                    fo = flujoEntrada.nextLine();
                    // agrega el telefono al arrayList lista
                    lista.add(fo);
                    System.out.println("Otro fono (si/no): ");
                    otro = flujoEntrada.nextLine();

                } while (otro.equals("si") || otro.equals("SI"));
                d.writeObject(new miAgenda(n, di, lista, e));

            } while (otro.equals("si") || otro.equals("SI"));
            //Cerrar flujos
            d.close();

        } catch (IOException i) {
            System.err.println(i);

        }
    }
}

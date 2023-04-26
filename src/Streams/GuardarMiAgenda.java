/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
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
        //String cadena = "fichero.txt";

        String otro, fo, n, di, e;

        try {
            File f = new File("agenda.dat");
            ObjectOutputStream d;

            if (f.exists()) {
                FileOutputStream ficha = new FileOutputStream(f, true);
                d = new MiObjectOutputStream(ficha);
            } else {
                FileOutputStream ficha = new FileOutputStream(f);
                d = new ObjectOutputStream(ficha);

            }
            miAgenda agenda = new miAgenda();

            //BufferedOutputStream b = new BufferedOutputStream(ficha);
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

        } catch (FileNotFoundException f) {
            System.err.println(f);

        }catch(IOException i){
            System.out.println(i.getMessage());
        }catch(Exception f){
            System.out.println(f.getMessage());
        }
    }
}

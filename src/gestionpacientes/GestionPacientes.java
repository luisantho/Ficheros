/*
 * 2.- Desarrollar un sistema de gestión de pacientes:
Tendremos un archivador dónde iremos guardando todas las fichas de los pacientes. 
* Las fichas contienen la siguiente información: nombre, apellidos y edad.
Todas las fichas que vayamos creando, se podrán guardar o eliminar del archivador. 
* Al archivador también le podremos pedir un listado. 
* Este listado consistirá en visualizar por pantalla el número de fichas guardadas, 
* así como el contenido de las fichas.
La clase GestionPacientes tiene un método main en el que se crea un archivador, 
* dos o tres fichas que se guardarán en el archivador, se listará el contenido, 
* se eliminará alguna ficha y se volverá a listar su contenido.
Todas las clases se guardarán en el paquete gestionpacientes

 */
package gestionpacientes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestionPacientes {

    public static void main(String[] args) {
        Archivador a = new Archivador();
        Ficha f = new Ficha("Pepe", "Lopez", 22);
        
        //Leemos  los datos en un fichero. 

        ObjectInputStream ist;
        try {
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("pacientes.dat")));
            a = (Archivador) ist.readObject();
            ist.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }


        a.guardar(f);
        a.guardar(new Ficha("Teresa", "Argente", 12));
        a.guardar(new Ficha("Edudardo", "Boscá", 34));
        a.listar();
        a.eliminar(f);
        a.listar();
        
        //Guardar
        ObjectOutputStream ost;
        try{
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("pacientes.dat")));
           ost.writeObject(a);
           ost.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(EOFException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

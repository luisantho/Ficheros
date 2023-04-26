/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFicheros;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author luibol
 */
public class GuardarAlumno {
    public static void main(String[] args) {
        //Creamos un ArrayList para almacenar los alumnos
        ArrayList <Alumno> listaAlumnos = new ArrayList();
        Alumno a = new Alumno();
        
        //Leer 
        ObjectInputStream ist;
        try{
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("alumnos.dat")));
            a = (Alumno) ist.readObject();
            ist.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}

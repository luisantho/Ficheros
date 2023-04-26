/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaFicheros;

import java.util.Scanner;

/**
 *
 * @author luibol
 */
public class Alumno {

    //Atributos
    private int carnet;
    private String nombre;
    private String apellidos;
    private int nota1, nota2, nota3;

    //Constructor
    public Alumno(int carnet, String nombre, String apellidos, int nota1, int nota2, int nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    //Constructor vacio 
    public Alumno(){
    }

    //Setters
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    //Getters

    public int getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Alumno" + "carnet:" + carnet + ", nombre:" + nombre + ", apellidos:" + apellidos + ", nota1:" + nota1 + ", nota2:" + nota2 + ", nota3:" + nota3;
    }
    
    //Metodos
    public static void ponerDatos(){
        Alumno a = new Alumno();
        Scanner tcl = new Scanner (System.in);
        System.out.println("*****Introducir datos*****");
        System.out.println("");
        try{
        System.out.println("Introduce tu numero de carnet:");
        int carnet = tcl.nextInt();
        a.setCarnet(carnet);
        
        System.out.println("Introduce tu nombre:");
        String nombre = tcl.nextLine();
        a.setNombre(nombre);
        
        System.out.println("Introduce tus apellidos:");
        String apellidos = tcl.nextLine();
        a.setApellidos(apellidos);
        
        System.out.println("Introduce tu nota 1:");
        int nota1 = tcl.nextInt();
        a.setNota1(nota1);
        
         System.out.println("Introduce tu nota 2:");
        int nota2 = tcl.nextInt();
        a.setNota2(nota2);
        
        System.out.println("Introduce tu nota 3:");
        int nota3 = tcl.nextInt();
        a.setNota3(nota3);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    

}

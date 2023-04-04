/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luibol
 */
public class miAgenda implements Serializable {

    //Atributos
    private String nombre;
    private String direccion;
    private ArrayList<String> fono;
    private String email;

    //Constructor con todo y vacio
    public miAgenda() {
    }

    public miAgenda(String nombre, String direccion, ArrayList<String> fono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fono = fono;
        this.email = email;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getFono() {
        return fono;
    }

    public String getEmail() {
        return email;
    }
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //ToString

    @Override
    public String toString() {
        return "" + "nombre:" + nombre + ", direccion:" + direccion + ", fono:" + fono + ", email:" + email + '}';
    }
    

}

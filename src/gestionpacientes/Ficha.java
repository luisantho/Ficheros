/*
 *
 */
package gestionpacientes;

import java.io.Serializable;

public class Ficha implements Serializable{

    // Atributos
    private String nombre = null;
    private String apellidos = null;
    private int edad = 0;
// Contructores
    public Ficha(String param1, String param2, int param3) {
        nombre = param1;
        apellidos = param2;
        edad = param3;
    }
// Métodos
    public String toString() //alternativa 1
    {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
    }
    public String mostrar() //alternativa 2
    {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
    }
    
}

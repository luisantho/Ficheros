/*
 *
 */
package gestionpacientes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Archivador implements Serializable {

    // Atributos
    private ArrayList<Ficha> pacientes = new ArrayList();
// Métodos

    public void guardar(Ficha param) {
        pacientes.add(param);
    }

    public void eliminar(Ficha param) {
        pacientes.remove(param);
    }

    public void listar() {
        System.out.println("Número de fichas: " + pacientes.size());

        for (int i = 0; i < pacientes.size(); i++) {
            //System.out.println(pacientes.get(i).mostrar());
            System.out.println(pacientes.get(i));
        }
    }
}

package Serviceejap;

import Entiddd.perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class servicioPerros {

    private Scanner leer = new Scanner(System.in);
    ArrayList<String> razasPerros = new ArrayList();

    public void llenarLista(ArrayList<String> perros) {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        razasPerros.add(nombre);
        System.out.println("Introducir raza");
        String raza = leer.next();
        razasPerros.add(raza);
        Iterator iterator = razasPerros.iterator();
        System.out.println("Esta es su lista: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

    }

    public ArrayList<String> llenarLista() {
        ArrayList<String> razasPerros = new ArrayList();
        razasPerros.add(nombre);
        return razasPerros;

    }
}

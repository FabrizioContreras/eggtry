package ej1poo.Servicio;

import ej1poo.Entidad.Libro;
import java.util.Scanner;

public class ServicioReg {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro CargarLibro() {
        System.out.println("Ingrese el ISBN");
        int ISBN = leer.nextInt();
        System.out.println("Ingre el nombre del libro");
        String Titulo = leer.next();
        System.out.println("Ingre el nombre del Autor");
        String Autor = leer.next();
        System.out.println("Ingrese el numero de paginas del libro");
        int NDePag = leer.nextInt();
        return new Libro(ISBN, Titulo, Autor, NDePag);
    }
}

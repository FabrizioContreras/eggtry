package ej3poo;

import ej3poo.Entidad.Division;
import ej3poo.Entidad.Multiplicacion;
import ej3poo.Entidad.Operacion;
import ej3poo.Entidad.Resta;
import ej3poo.Entidad.sumar;
import ej3poo.Servicio.Servicio;
import java.util.Scanner;

public class Ej3Poo {

    private Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Servicio sm = new Servicio();
        Operacion o1 = sm.crearOperacion();
        System.out.println();

    }
}

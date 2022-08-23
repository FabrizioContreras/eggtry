package ej1poo;

import ej1poo.Entidad.Libro;
import ej1poo.Servicio.ServicioReg;

public class Ej1Poo {

    public static void main(String[] args) {

        ServicioReg sm = new ServicioReg();

        Libro l1 = sm.CargarLibro();
        System.out.println(l1);

    }

}

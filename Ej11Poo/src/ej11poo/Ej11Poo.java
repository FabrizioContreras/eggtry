package ej11poo;

import fechas.tresFechas;
import servicio.servDate;

public class Ej11Poo {

    public static void main(String[] args) {
        servDate servicio = new servDate();
        tresFechas[] crearFechas = servicio.crearFechas(0);
        tresFechas[] fecha = servicio.crearFechas(3);


    }

}

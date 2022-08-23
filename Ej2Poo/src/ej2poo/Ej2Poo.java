package ej2poo;

import ej2poo.Entidad.Circunferencia;
import ej2poo.Servicio.Servicio;

public class Ej2Poo {

    public static void main(String[] args) {
        Servicio sm = new Servicio();
        Circunferencia c1 = sm.crearCircunferencia();
        System.out.println(c1);
    }

}

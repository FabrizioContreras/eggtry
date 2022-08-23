package ej4poo;

import ej4poo.entidad.Perimetro;
import ej4poo.entidad.Superficie;
import ej4poo.entidad.Rectangulo;
import ej4poo.servicio.Servicio;

public class Ej4Poo {

    public static void main(String[] args) {
        Servicio sm = new Servicio();
        Rectangulo r1 = sm.newRectangulo();
        System.out.println(r1);

    }

}

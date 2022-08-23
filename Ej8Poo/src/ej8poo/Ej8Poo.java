package ej8poo;

import Servicio.serv;
import Entidad.Cadena;

public class Ej8Poo {

    public static void main(String[] args) {
        serv sm = new serv();
        String c1 = sm.crearCadena();
        sm.longitud(c1);
        sm.invertir(c1);
        System.out.println(sm.invertir(c1));

    }

}

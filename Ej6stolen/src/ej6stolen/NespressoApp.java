package ej6stolen;

import entidad.Nespresso;
import servicio.NespressoServicio;

/**
 *
 * @author Fabrizio Contreras
 */
public class NespressoApp {

    public static void main(String[] args) {

        Nespresso cafetera = new Nespresso();

        NespressoServicio servicio = new NespressoServicio();

        servicio.ejecutarOperaciones(cafetera);

    }

}

package ej5poo;

import ej5poo.Entidad.CuentaBancaria;
import ej5poo.Servicio.Servicio;

public class Ej5Poo {

    public static void main(String[] args) {
        Servicio sm = new Servicio();
        CuentaBancaria c1 = sm.newcuenta();
        c1.cuenta();

    }

}

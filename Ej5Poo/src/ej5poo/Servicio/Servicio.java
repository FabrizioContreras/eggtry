package ej5poo.Servicio;

import ej5poo.Entidad.CuentaBancaria;
import java.util.Scanner;

public class Servicio {

    public Scanner leer = new Scanner(System.in);

    public CuentaBancaria newcuenta() {

        return new CuentaBancaria();
    }

}

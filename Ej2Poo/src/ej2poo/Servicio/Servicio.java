package ej2poo.Servicio;

import ej2poo.Entidad.Circunferencia;
import java.util.Scanner;

public class Servicio {

    private Scanner leer = new Scanner(System.in);
    double area, rad, perimetro;

    public Circunferencia crearCircunferencia() {
        System.out.println("ingrese el radio del circulo");
        rad = leer.nextDouble();
        area = Math.PI * Math.pow(rad, 2);
        perimetro = 2 * Math.PI * rad;
        System.out.println("El Area del circulo es:" + area);
        System.out.println("El perimetro de la circunferencia es:" + perimetro);
        return new Circunferencia();
    }

}

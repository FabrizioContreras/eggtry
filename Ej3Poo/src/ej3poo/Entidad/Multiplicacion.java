package ej3poo.Entidad;

public class Multiplicacion extends Operacion {

    double multi;

    public Multiplicacion(double n1, double n2) {

        if (n2 == 0) {
            System.out.println("ERROR: no se puede multiplicar por cero");
        } else {
            this.multi = n1 * n2;
        }
        this.setRes(this.multi);
    }
}

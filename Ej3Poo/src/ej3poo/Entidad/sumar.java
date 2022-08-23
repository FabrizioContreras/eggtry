package ej3poo.Entidad;

public class sumar extends Operacion {

    double sumar;

    public sumar(double n1, double n2) {

        this.sumar = n1 + n2;
        this.setRes(this.sumar);
    }
}

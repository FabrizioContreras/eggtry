package ej3poo.Entidad;

public class Division extends Operacion {

    double div;

    public Division(double n1, double n2) {

        if (n2 == 0) {
            System.out.println("ERROR: no se puede division entre cero");
        } else {
            this.div = n1 / n2;
        }
        this.setRes(this.div);
    }

}

package ej3poo.Entidad;

public class Operacion {

    private double n1, n2;
    public double Res;
    char operacion;

    public Operacion() {
    }

    public Operacion(double n1, double n2, double Res, char operacion) {
        this.n1 = n1;
        this.n2 = n2;
        this.Res = Res;
        this.operacion = operacion;
    }

    public void mostrarResultado() {
        System.out.println(this.n1 + " " + this.operacion + " " + this.n2 + " = " + this.Res);
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getRes() {
        return Res;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setRes(double Res) {
        this.Res = Res;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

}

package entidad;

public class Nespresso {

    private double capacidadMaxima;

    private double capacidadActual;

    public Nespresso() {

        capacidadActual = 1000;

        capacidadMaxima = 1000;
    }

    public Nespresso(double capacidadActual) {

        this.capacidadActual = capacidadActual;
    }

    public Nespresso(double capacidadMaxima, double capacidadActual, double cantidadCafe) {

        this.capacidadMaxima = capacidadMaxima;

        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {

        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {

        this.capacidadMaxima = capacidadMaxima;

    }

    public double getCapacidadActual() {

        return this.capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {

        this.capacidadActual = capacidadActual;
    }
}

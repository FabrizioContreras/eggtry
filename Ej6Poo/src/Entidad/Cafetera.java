package Entidad;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;
    int taza;
    int relleno;

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //se empiezan a declarar los constructores
    //se establece la capacidad maxima en 1000 y se inicializa la cantidad actual
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    //llena la cafetera a la capacidad maxima
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;

    }

    //contiene la capacidad maxima y la actual, si la actual es superior, la ajusta al maximo
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        //la cantidad actual, es llenada a su capacidadMaxima

    }

    public void servirTaza(int taza) {

        if (cantidadActual - taza <= 0) {
            cantidadActual = 0;
        } else {
            cantidadActual = cantidadActual - taza;
        }

    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.

    public void vaciarCafetera() {
        cantidadActual = 0;

    }

    /*
     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
     recibe y se añade a la cafetera la cantidad de café indicada.
     */
    void agregarCafe(int relleno) {

        cantidadActual += relleno;

    }

}

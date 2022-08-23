package ej4poo.entidad;

public class Superficie extends Rectangulo {

    int superficie;

    public Superficie(int altura, int base) {
        this.superficie = base * altura;

    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Superficie{" + "superficie=" + superficie + '}';
    }
    
}

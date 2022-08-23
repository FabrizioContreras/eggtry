package ej4poo.entidad;

public class Perimetro extends Rectangulo {
    int perimetro;
    int p;

    public Perimetro(int base, int altura) {
        super(base, altura);
        p=(base+altura);
        this.perimetro= (int) Math.pow(p, 2);
    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getP() {
        return p;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void setP(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Perimetro{" + "perimetro=" + perimetro + '}';
    }
    
}

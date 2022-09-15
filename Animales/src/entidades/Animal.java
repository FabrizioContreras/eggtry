package entidades;

public abstract class Animal {

    protected Integer patas;
    protected Boolean cola;
    protected Integer anosDeVida;
    protected Double Energia;

    public Animal(Integer patas, Boolean cola, Integer anosDeVida, Double Energia) {
        this.patas = patas;
        this.cola = cola;
        this.anosDeVida = anosDeVida;
        this.Energia = Energia;
    }

    public abstract void calcularEdad();

    public void hacerRuido() {
        System.out.println("**respiracion animal");
    }

}

package entidades;

public class Perro extends Animal{

    private String razaPerruna;

    public Perro(String razaPerruna, Integer patas, Boolean cola, Integer anosDeVida, Double Energia) {
        super(patas, cola, anosDeVida, Energia);
        this.razaPerruna = razaPerruna;
    }

    public String getRazaPerruna() {
        return razaPerruna;
    }

    public void setRazaPerruna(String razaPerruna) {
        this.razaPerruna = razaPerruna;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public Integer getAnosDeVida() {
        return anosDeVida;
    }

    public void setAnosDeVida(Integer anosDeVida) {
        this.anosDeVida = anosDeVida;
    }

    public Double getEnergia() {
        return Energia;
    }

    public void setEnergia(Double Energia) {
        this.Energia = Energia;
    }
    
    public void jugarEnParque(int tiempo){
        for (int i = 0; i < tiempo; i++) {
            Energia -= 10;
        }
        System.out.println("La cantidad de energia restante es " + this.Energia);
    }

    @Override
    public void calcularEdad() {
             System.out.println("La edad perruna para " + this.anosDeVida + " es " + (anosDeVida * 7));

    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Guaaaaaaauuu");
    }
    
    
    
}

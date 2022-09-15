package entidades;

public final class Gato extends Animal{

    private String razaGatuna;

    public Gato(String razaGatuna, Integer patas, Boolean cola, Integer anosDeVida, Double Energia) {
        super(patas, cola, anosDeVida, Energia);
        this.razaGatuna = razaGatuna;
    }

    public String getRazaGatuna() {
        return razaGatuna;
    }

    public void setRazaGatuna(String razaGatuna) {
        this.razaGatuna = razaGatuna;
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

public void ronronear(){
    System.out.println("Prrrrrrrrrr....");
}

    @Override
    public void calcularEdad() {
        System.out.println("La edad Gatuna para " + this.anosDeVida + " es " + (anosDeVida * 8));
    }

    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miauuuuuuuuu");
    }


    
    
    
    
    
}

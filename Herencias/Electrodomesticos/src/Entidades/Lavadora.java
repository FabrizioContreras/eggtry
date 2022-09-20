package Entidades;

public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestivo(1000, peso, consumoEnergetico, color);
        this.carga=carga;
    }

    @Override
    public double precioFinal() {
        return super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
    }


}

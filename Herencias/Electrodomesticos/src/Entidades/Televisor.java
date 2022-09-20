package Entidades;

public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizadorTDT, Integer precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevision() {
        super.crearElectrodomestivo(1000, peso, consumoEnergetico, color);
    }

    @Override
    public double precioFinal() {
        return super.precioFinal();
        
    }



}

package Entidades;

public abstract class Electrodomestico {

    protected double precioBase;
    protected Integer precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        if ("A".equals(consumoEnergetico) || "B".equals(consumoEnergetico) || "C".equals(consumoEnergetico) || "D".equals(consumoEnergetico) || "E".equals(consumoEnergetico) || "F".equals(consumoEnergetico)) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    private void comprobarColor(String color) {
        
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestivo(double precioBase, Integer peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public double precioFinal() {
        double plus = 0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 1000;
                break;
            case 'B':
                plus += 800;
                break;
            case 'C':
                plus += 600;
                break;
            case 'D':
                plus += 500;
                break;
            case 'E':
                plus += 300;
                break;
            case 'F':
                plus += 100;
                break;
        }
        if (peso >= 1 && peso < 19) {
            plus += 100;
        } else if (peso >= 20 && peso < 49) {
            plus += 500;
        } else if (peso >= 50 && peso < 79) {
            plus += 800;
        } else if (peso >= 80 && peso < 100) {
            plus += 1000;
        }
        return precioBase + plus;
    }
}

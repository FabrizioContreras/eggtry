package animales;

import entidades.Gato;
import entidades.Perro;

public class Animales {

    public static void main(String[] args) {

        Gato g = new Gato("negraso", 4, true, 5, 1000d);
        Perro p = new Perro("caniche", 4, true, 13, 1000d);
        
        g.calcularEdad();
        g.hacerRuido();
        g.ronronear();
        
        System.out.println("--------------------------------------------");
        
        p.calcularEdad();
        p.hacerRuido();
        p.jugarEnParque(5);
        
    }

}

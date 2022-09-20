package Main;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class main {

    public static void main(String[] args) {

        Electrodomestico tele1 = new Televisor(40, true, 2000, "negro", 'A', 20);
        tele1.crearElectrodomestivo(1000, 50, 'z', "negro");
        tele1.precioFinal();
        System.out.println(tele1.precioFinal());
        Electrodomestico lava2 = new Lavadora(40, 8000, "negro", 'o', 100);
        lava2.crearElectrodomestivo(1000, 80, 'a', "gris");
        lava2.precioFinal();
        System.out.println(lava2.precioFinal());
    }

}

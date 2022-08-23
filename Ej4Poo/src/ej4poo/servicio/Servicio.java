package ej4poo.servicio;

import ej4poo.entidad.Perimetro;
import ej4poo.entidad.Rectangulo;
import ej4poo.entidad.Superficie;
import java.util.Scanner;

public class Servicio {

    private Scanner leer = new Scanner(System.in);
    static int i = 0;
    static int j = 0;

    public Rectangulo newRectangulo() {
        
        System.out.println("Ingrese el alto del rectangulo: ");
        int altura = leer.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");
        int base = leer.nextInt();
        while (i < altura) {
            while (j < base) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
        Superficie sup= new Superficie(base,altura);
        System.out.println("La superficie del rectangulo es: ");
        System.out.println(sup);
        
        Perimetro per= new Perimetro(base,altura);
        System.out.println("El perimetro del rectangulo es: ");
        System.out.println(per);
        
        return newRectangulo();
    }
    
}

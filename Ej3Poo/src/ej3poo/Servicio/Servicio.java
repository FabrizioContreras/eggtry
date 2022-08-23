package ej3poo.Servicio;


import ej3poo.Entidad.Division;
import ej3poo.Entidad.Multiplicacion;
import ej3poo.Entidad.Operacion;
import ej3poo.Entidad.Resta;
import ej3poo.Entidad.sumar;
import java.util.Scanner;

public class Servicio {
    
    private Scanner leer= new Scanner(System.in);
    double n1;
    double n2;
    public Operacion crearOperacion() {

        System.out.println("ingrese un numero");
        n1 = leer.nextDouble();
        System.out.println("ingrese un segundo numero");
        n2 = leer.nextInt();
        
        //suma
                sumar sum = new sumar(n1, n2);
                System.out.println("La suma de los numeros es: ");
        sum.mostrarResultado();

        //resta
        Resta res = new Resta(n1, n2);
        System.out.println("La resta de los numeros es: ");
        res.mostrarResultado();

        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1, n2);
        System.out.println("La multiplicacion de los numeros es: ");
       mul.mostrarResultado();

        //division
        Division div = new Division(n1, n2);
        System.out.println("La division de los numeros es: ");
        div.mostrarResultado();
        
        return new Operacion();

        
    }

    
}

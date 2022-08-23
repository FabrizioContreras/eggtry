package Servicio;

import entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
     
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona CrearPersona(){
        
        System.out.println("Introducir Nombre");
        String nombre = leer.next();
        System.out.println("Introducir Apellido");
        String apellido = leer.next();
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
       
       return new Persona(nombre, apellido, edad);
             
    }
    
}

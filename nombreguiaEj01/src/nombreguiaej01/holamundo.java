/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombreguiaej01;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //muestra mensaje por pantalla
        System.out.println("ingresa tu nombre:");
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        System.out.print("Hola Mundo! Soy " + nombre + " y estoy programando con Java!");
    }
    
    
}

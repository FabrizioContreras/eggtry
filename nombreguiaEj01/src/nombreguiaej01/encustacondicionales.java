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
public class encustacondicionales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        opinion = leer .nextInt(); 
        
        if (opinion >= 1 && opinion <=5){
            
            switch (opinion){
            case 1:
            case 2:
                System.out.println("Nos sentimos apenados que no hayas disfrutado la peli....");
                break;
            case 3:
                System.out.println("has clasificado la peli como buena");
                break;
            case 4:
                System.out.println("has clasificado la peli como muy buena");
                break;
            case 5:
                System.out.println("Fantastico quie haya disfrutado un excelente entretenimiento");
                break;
            }
           }else if (opinion <0){
               System.out.println("¿una opinión negativa?¿Taaaaaan mala fue la pelicula? :(");
        }
        
        
        
        
        
        
        
        
        
    }
   
}

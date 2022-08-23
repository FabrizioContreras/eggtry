package Poo01Persona;

import Servicio.ServicioPersona;
import entidad.Persona;


public class POOOEj01 {

    public static void main(String[] args) {

        ServicioPersona sm = new ServicioPersona();
        
        Persona p1 = sm.CrearPersona();
        
        System.out.println(p1);
        System.out.println("-----------");
     
    }

}

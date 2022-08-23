package ej7poo;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class PersonaApp {
    
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        Persona[] listaPersonas = servicio.crearPersonasPrueba();
        servicio.porcentajesPeso(listaPersonas);
        servicio.porcentajeEdad(listaPersonas);
    }
    
}

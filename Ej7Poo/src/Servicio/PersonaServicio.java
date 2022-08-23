package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese los siguientes datos: ");
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su edad");
        double edad = leer.nextDouble();
        System.out.println("ingrese su sexo(M: masculino - F: Femenino - X: Otro)");
        String sexo = leer.next();
        System.out.println("ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("ingrese su altura");
        double altura = leer.nextDouble();
        while (sexo != "M" || sexo != "H" || sexo != "X") {
            System.out.println("Por favor ingrese M, F o X");
            sexo = leer.next();
        }

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;

    public int calcularIMC(Persona persona) {
        double pesoIdeal = persona.getPeso() * Math.pow(persona.getAltura(), 2);
        if (pesoIdeal < 20) {
            return IMC_BAJO;
        } else if (pesoIdeal < 25) {
            return IMC_ALTO;
        } else {
            return IMC_IDEAL;
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona[] crearPersonas(int cant) {
        Persona[] personas = new Persona[cant];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = crearPersona();
        }
        return personas;
    }

    public void porcentajesPeso(Persona[] personas) {

        int contadorAlto = 0;

        int contadorBajo = 0;

        int contadorIdeal = 0;

        int cantidadPersonas = personas.length;

        for (Persona persona : personas) {

            switch (calcularIMC(persona)) {

                case -1:

                    System.out.print(persona.getNombre() + " esta persona está por debajo de su peso ideal.");

                    System.out.println();

                    contadorBajo++;

                    break;

                case 0:

                    System.out.print(persona.getNombre() + " esta persona está en su peso ideal.");

                    System.out.println();

                    contadorIdeal++;

                    break;

                case 1:

                    System.out.print(persona.getNombre() + " esta persona está por encima de su peso ideal.");

                    System.out.println();

                    contadorAlto++;

                    break;
            }
        }

        System.out.println("Hay " + ((contadorBajo * 100) / cantidadPersonas) + " % de personas están por debajo de su peso ideal");

        System.out.println();

        System.out.println("Hay " + ((contadorIdeal * 100) / cantidadPersonas) + " % de personas están en su peso ideal");

        System.out.println();

        System.out.println("Hay " + ((contadorAlto * 100) / cantidadPersonas) + " % de personas están por encima de su peso ideal");

        System.out.println();
    }

    public void porcentajeEdad(Persona[] personas) {

        int cantidadPersonas = personas.length;

        int contadorMayor = 0;

        for (Persona persona : personas) {

            if (esMayorDeEdad(persona)) {

                contadorMayor++;

                System.out.println(persona.getNombre() + " es mayor de edad!");

                System.out.println();
            }
        }
        System.out.println("Hay " + ((contadorMayor * 100) / cantidadPersonas) + " % de personas mayores");

        System.out.println();

        System.out.println("Hay " + (((cantidadPersonas - contadorMayor) * 100) / cantidadPersonas) + " % de personas menores");

        System.out.println();
    }

    public Persona[] crearPersonasPrueba() {

        Persona[] personas = new Persona[4];

        personas[0] = new Persona("Franco ", 15, " H ", 69, 1.69);

        personas[1] = new Persona("Pamela ", 20, " M ", 70, 1.82);

        personas[2] = new Persona("Fab ", 19, " X ", 54, 1.65);

        personas[3] = new Persona("Blake ", 28, " X ", 85, 1.79);

        return personas;
    }

}

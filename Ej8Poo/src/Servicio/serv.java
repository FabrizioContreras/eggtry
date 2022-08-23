package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class serv {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String crearCadena() {
        System.out.println("Ingrese una frase");
        String Cadena = leer.next();
        return Cadena;
    }

    public int longitud(String Cadena) {
        int longitud = Cadena.length();
        return longitud;
    }

    public int mostrarVocales(String Cadena) {
        String vocal = "aeiou";
        int contador = 0;
        for (int x = 0; x < Cadena.length(); x++) {
            char voc = Cadena.charAt(x);
            String vocs = String.valueOf(voc);
            if (vocal.contains(vocs)) {
                contador++;
            }
        }
        return contador;
    }

    public String invertir(String Cadena) {
        String invertido = "";
        for (int i = Cadena.length() - 1; i < -1; i--) {
            char voc = Cadena.charAt(i);
            String vocs = String.valueOf(voc);
            invertido += vocs;
        }
        return invertido;
    }

    public int contarLetra(String cadena, char caracter) {
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char voc = cadena.charAt(i);
            String vocs = String.valueOf(voc);
            if (cadena.contains(vocs)) {
                cont++;
            }
        }
        return cont;
    }

}

package Animal;

import entidades.Animales;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Animal {

    public static void main(String[] args) {

        Animales Perro1 = new Perro("lolito", "carnivoro", 10, "caniche");
        Perro1.Alimentarse();

        Animales Gato1 = new Gato("Luna", "croquetas", 7, "negrasa");
        Gato1.Alimentarse();
        
        Animales Caballo1 = new Caballo("dientes", "hervibiro", 20, "albino");
        Caballo1.Alimentarse();
    }

}

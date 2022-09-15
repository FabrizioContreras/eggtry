package entidades;

//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal
public abstract class Animales {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animales(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
// mensaje por pantalla informando de que se alimenta

    public abstract void Alimentarse();

}



package Entiddd;


public class perros {
 public String nombre;
 public String raza;

    public perros() {
    }

    public perros(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "perros{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
 
}

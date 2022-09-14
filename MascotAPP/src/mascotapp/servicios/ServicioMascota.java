package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Mascota> mascotas;

    public ServicioMascota() {
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {

        System.out.println("Introducir nombre");
        String nombre = leer.next();

        System.out.println("Introducir apodo");
        String apodo = leer.next();

        System.out.println("Introducir tipo");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {

        System.out.println("Las Mascotas actuales de la Lista Mascotas son");
        for (Mascota var : mascotas) {
            System.out.println(var.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
    }

    /**
     * crea mascotas,Todos Chiquitos
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     */
    public void fabricaChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("fer", "chiquito", "perro"));
        }

    }


    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
//            System.out.println("Quisiera agregar otra mascotas?  S/N");
//            System.out.println("Si no agrega mas mascotas saldra del programa");
//            String respuesta = leer.next();
//            if ("S".equals(respuesta)) {
            agregarMascota(mascotaCreada);
//            } else {
//                System.out.println("Esperamos que regrese Pronto");
            System.out.println(mascotaCreada.toString());

        }
    }

//TODO Añadir Try and Catch
//    public void actualizarMascota(int index) {
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//
//    }

    public void actualizarMascota(int index) {
        if (index >= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("-----------Actualizar-------------");

            Mascota m = crearMascota();

            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al Elimniar El indice es erroneo");
        }
    }


    public void eliminiarMascota(int index) {

        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al Eliminar El indice es erroneo");
        }

    }
}

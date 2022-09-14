package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();

        sm.fabricaMascota(Integer.MAX_VALUE);

        sm.mostrarMascotas();

//        sm.actualizarMascota(0);
//
//        sm.mostrarMascotas();
//
//        sm.eliminiarMascota(3);
//        
//        sm.mostrarMascotas();
    }

}

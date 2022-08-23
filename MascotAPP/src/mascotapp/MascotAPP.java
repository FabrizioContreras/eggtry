package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.service.ServiceMascota;

public class MascotAPP {

    public static void main(String[] args) {

        ServiceMascota sm = new ServiceMascota();

        sm.fabricaMascota(2);

        sm.mostrarMascotas();

        sm.actualizarMascota(0);

        sm.mostrarMascotas();

        sm.eliminiarMascota(3);
        
        sm.mostrarMascotas();

    }

}

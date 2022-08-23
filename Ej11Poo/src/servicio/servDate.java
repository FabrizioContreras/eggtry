package servicio;

import fechas.tresFechas;
import java.util.Calendar;
import java.util.Scanner;
import static javax.management.Query.gt;


public class servDate {

    int cont = 0;

    public tresFechas ingfecha() {
        System.out.println("Por favor ingrese tres fechas");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Día");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        return new tresFechas();
    }

    public tresFechas[] crearFechas(int cant) {
        tresFechas[] fecha = new tresFechas[cant];
        for (int i = 0; i < fecha.length; i++) {
            fecha[i] = ingfecha();

        }
        return fecha;
    }
    public tresFechas entreFechas(){
        
            
        return null;
        
    }
    public static void calen(int fecha, int dia,int mes, int anio){
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.DATE, dia);
        c1.set(Calendar.MONTH, mes);
        c1.set(Calendar.YEAR, anio);
         
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DATE, dia);
        c2.set(Calendar.MONTH, mes);
        c2.set(Calendar.YEAR, anio);
         
        int diferencia = calcularAniosCalendar(c1, c2);
         
        System.out.println("Diferencia de " + diferencia + " años");
        
              
    }
    public static int calcularAniosCalendar(Calendar inicio, Calendar fin) {
 
        // Calcula la diferencia de años
        int diferencia = fin.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
 
        // Si la diferencia de años es 0, no hay que restar nada
        // Si el año del dia de la fecha que yo paso es mayor que la actual, resto uno
        
 
        return diferencia;
 
    }
}

package colecciones;

import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {

        //Arrays
        String[] nombresArray = new String[5];

        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "chiquito" + (i + 1);
        }
        for (String var : nombresArray) {
            System.out.println(var);
        }

        //collections
        ArrayList<String> nombresArrayList = new ArrayList();

        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");
        nombresArrayList.add("chiquito");

        System.out.println(nombresArrayList.size());
        nombresArrayList.remove("chiquito");
        System.out.println(nombresArrayList.size());
    }

}

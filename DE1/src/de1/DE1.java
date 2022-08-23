package de1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class DE1 {

    public static void main(String[] args) {

        //ESTE ESTA MAL
        //Array<int> listado = new ArrayList;
        //CORRECCION
        ArrayList< Integer> listado = new ArrayList();
        int x=20;
        int t=320;
        int u=23;
        int w=12;
        int p=13;
        listado.add(x,p);
        listado.remove(p);
        
        //ESTE ESTA MAL
        //TreeSet<String> = TreeSet();
        //CORRECCION
        TreeSet<Integer> algo = new TreeSet();
        int y = 40;
        algo.add(y);
        //ESTE ESTA MAL
        //HashMap<Integer> personas = new HashMap<>;
        //CORRECCION
        HashMap<Integer, String> personas = new HashMap();
        int dni = 94328553;
        String nombreYo = "yojeje";
        personas.put(dni, nombreYo);
    }

}

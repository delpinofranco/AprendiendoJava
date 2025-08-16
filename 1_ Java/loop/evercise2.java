package loop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class evercise2 {
    public static void main(String[] args) {
        ArrayList <String> nombre = new ArrayList<>();
        nombre.add("franco");
        nombre.add("matias");
        nombre.add("francisco");
        nombre.add("ivan");

        for(String nombres:nombre){
            System.out.println(nombres);

        }
        int i =0 ;
        System.out.println("Los nombre de la lista son los siguientes.");
        do {

            String corte = nombre.get(i);
            System.out.println(corte);
            i++;

        }while (i<=nombre.toArray().length-1);

    }
}

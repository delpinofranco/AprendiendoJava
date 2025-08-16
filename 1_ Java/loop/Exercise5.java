package loop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        HashSet<String> nombre = new HashSet<>();
        HashMap<String, Integer> diccionario = new HashMap<>();
        diccionario.put("franco",28);
        diccionario.put("matias",28);
        diccionario.put("francisco",28);
        nombre.add("Franco");
        nombre.add("Matías");
        nombre.add("Franco");


        for (String nom : nombre ) {
            System.out.println(nom);


        }
        for (String clave: diccionario.keySet())
        System.out.println(clave);
        for (Map.Entry<String,Integer>entry:diccionario.entrySet())
            System.out.println(entry.getKey()+ " " + entry.getValue());
    }
}

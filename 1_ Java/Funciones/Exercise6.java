package Funciones;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String[] args) {
        var  lista = new ArrayList<String>();
        lista.add("matias");
        lista.add("francisco");
        lista.add("franco");
        lista.add("ivan");
        lista(lista);
    }
    public static  void lista(ArrayList<String> lista){
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
}

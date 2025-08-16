package Funciones;

import java.util.List;
import java.util.ArrayList;


public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Agregar elementos
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        Resultado(numeros);

    }
    public static void Resultado(List<Integer> lista){
         double total = 0;
        for ( int num: lista){
            total+= num;

        }
        if (lista.size() > 1){
            var resultado=total / lista.size();
            System.out.println(resultado);
        }


    }
}

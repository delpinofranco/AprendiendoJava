package loop;

import java.lang.reflect.Array;

public class exercise4 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        for (int num : numeros)
            System.out.println(num);

        for (int cont = 0; cont <= numeros.length-1; cont++)
        System.out.println(numeros[cont]);
    }
}

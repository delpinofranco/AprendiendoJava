package TodoCode;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int edad;
        String nombre;
        int dni;
       do {
           System.out.println("Ingrese su nombre");
            nombre = input.nextLine();

            System.out.println("Ingrese su edad");
            edad = input.nextInt();
           input.nextLine();

           System.out.println("Ingrese dni");
            dni = input.nextInt();
           input.nextLine();


           if (edad >= 6 && edad <= 10){
               System.out.println("Pertenece a la cateogira A");

           } else if (edad >= 11 && edad <= 17) {
               System.out.println("Pertenece a la cateogira B");

           } else if (edad >= 18 && edad <= 30) {
               System.out.println("Pertenece a la cateogira C");


           } else if (edad >= 31 && edad <= 50) {
               System.out.println("Pertenece a la cateogira Adultos mayores");

           }
       } while (edad != 0 && !nombre.equalsIgnoreCase("fin"));


    }
}

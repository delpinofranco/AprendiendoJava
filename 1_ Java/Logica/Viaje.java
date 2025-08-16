package TodoCode;

import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        int [][] planilla = new int [2][2];
        int asignarCantidadPasajes, cantidadAsiento,turno,destino;
        String bandera = "";

        Scanner teclado = new Scanner(System.in);

        // Cargar cantidad de asientos

        for (int i = 0; i <= planilla.length-1 ; i++) {
            for (int j = 0; j <=planilla.length-1 ; j++) {
                System.out.println("Ingrese la cantidad de asientos: ");
                asignarCantidadPasajes = teclado.nextInt();
                planilla [i][j] = asignarCantidadPasajes;
            }

        }
        while (!bandera.equalsIgnoreCase("finish")){
            try{
                // Seleccionar destino
                System.out.println("Seleccione el destino");
                destino = teclado.nextInt()-1;
                teclado.nextLine();

                // Seleccionar turno
                System.out.println("Seleccione el turno que desee");
                turno = teclado.nextInt()-1;
                teclado.nextLine();

                // Seleccionar cantidad de asientos
                System.out.println("Ingrese la cantidad de pasaje que desee");
                cantidadAsiento = teclado.nextInt();
                teclado.nextLine();
                // Eleccion de viaje
                System.out.println(planilla[destino][turno]);
                if (planilla[destino][turno] >= cantidadAsiento){
                    planilla[destino][turno] = planilla[destino][turno] - cantidadAsiento;
                    System.out.printf("la nueva cantidad de asiento es: "+ planilla[destino][turno]);
                    System.out.println();
                    System.out.println("Escriba 'finish' para terminar o ENTER para continuar");
                    bandera = teclado.nextLine();
                } else   {
                    System.out.println("No hay suficientes asientos disponibles");
                }

            } catch (Exception e) {
                System.out.printf("Ocurrio un error: "+ e);
                System.out.println("Presione enter para volver al inicio");
                teclado.nextLine();
            }
        }







    }

}



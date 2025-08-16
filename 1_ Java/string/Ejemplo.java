package string;

public class Ejemplo {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.

        // 2. Muestra la longitud de una cadena de texto.

        // 3. Muestra el primer y Ãºltimo carÃ¡cter de un string.

        // 4. Convierte a mayÃºsculas y minÃºsculas un string.

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        // 6. Formatea un string con un entero.

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).

        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
            var cadena1 = "  hola MUNDO   ";

            var cadena2 = "  MUNDO  ";
            var entero = 1;

            System.out.println(cadena1 + " " + cadena2);

            var largo = cadena2.length();
            System.out.println(largo);
            var subcadena1 = cadena1.substring(0,1);
        System.out.println( subcadena1);
            var subcadena2 = cadena1.substring(3,4);
        System.out.println(subcadena2);
            var mayusculas = cadena1.toUpperCase();
        System.out.println(mayusculas);
        var minusculas = cadena2.toLowerCase();
        System.out.println(minusculas);
        System.out.println(cadena1.contains("NDO"));

        System.out.println(cadena1.strip());
        System.out.println(cadena1.replace(" ","-"));

        System.out.println(cadena1.length() == cadena2.length());


    }


}

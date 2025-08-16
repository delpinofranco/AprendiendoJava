package condicionales;

public class practica1 {
    public static void main(String[] args) {
        var age = 17;
        if (age > 18){
            System.out.println("Es mayor de edad");
        }else if (age == 18 ){
            System.out.println("Tiene 18 años recien cumplidos");

        }else {
            System.out.println("Es menor de edad");
        }
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).

        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.

        // 3. Dado un nÃºmero, verifica si es positivo, negativo o cero.

        // 4. Crea un programa que diga si un nÃºmero es par o impar.

        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.

        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.
        var num1 = 30;
        var num2 = 30;
        if (num1>num2){
            System.out.println("El primer numero es mayor que el segundo");
        } else if (num2 > num1) {
            System.out.println("El segundo numero es mayor que el primero");

        }else{
            System.out.println("Los numeros son iguales");
        }
    }
}

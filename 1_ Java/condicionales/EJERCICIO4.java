package condicionales;

public class EJERCICIO4 {
    public static void main(String[] args) {
        //Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.
        var num = 0;
        if (num>1 && num <=100){
            System.out.printf("El numero se encuentra en el rango de 1 a 100: %d ", num);

        }else {
            System.out.printf("El numero se encuentra fuera del rango: %d", num);
        }
    }
}

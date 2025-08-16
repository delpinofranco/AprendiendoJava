package condicionales;

public class ejercicio5 {
    public static void main(String[] args) {
        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.
        var dia = 10;


        switch (dia){
            case 1:
                System.out.println("El dia es lunes");
                break;
            case 2:
                System.out.println("El dia es martes");
                break;

            case 3:
                System.out.println("El dia es miercoles");
                break;
            case 4:
                System.out.println("El dia es jueves");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;
            default:
                System.out.println("El valor ingresado no corresponde a ningun dia");
        }

    }
}

import org.w3c.dom.ls.LSOutput;

public class bucle {
    public static void main(String[] args) {

        for(int i =200; i <= 250; i += 2){
            System.out.println(i);
        }
        int contador = 200;
        System.out.println("contador");
        while(contador <= 250){
            System.out.println(contador);
            contador +=2;
        }

        int conta = 200;
        System.out.println("conta");
        do{
            conta +=2;
            System.out.println(conta);

        } while( conta <=250);

    }



}

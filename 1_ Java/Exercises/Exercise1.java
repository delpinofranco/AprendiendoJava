package Exercises;

public class Exercise1 {
    public static void main(String[] args) {
       greet();
       GreetName("FRANCO");
       var  Resta = Rest(1,2);
        }
    public static void greet() {
        System.out.println("Welcome to the java course");
    }
    public static void GreetName(String name){
        System.out.println("Welcome to the java course"+ " " + name);
    }
    public static int Rest(int num1, int num2){
        return num1 - num2;
    }
    public static int Squeare(int num){
        return num*num;
    }
}


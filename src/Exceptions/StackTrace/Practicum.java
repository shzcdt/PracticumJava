package Exceptions.StackTrace;

public class Practicum {
    public static void main(String[] args) {
        calculate1();
    }

    public static void calculate1() {
        calculate2();
    }

    public static void calculate2() {
        calculate3();
    }

    public static void calculate3() {
        calculate4();
    }

    public static void calculate4(){
        System.out.println(10/0);
    }
}


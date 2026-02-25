package Polymorphism.Classical;

public class Practicum{
    public static void main(String[] args) {
        Openable can = new Can();
        can.open();

        Openable window = new Window();
        window.open();
    }
}

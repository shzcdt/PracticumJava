package Polymorphism.Classical;

public class Dove implements MailClient{
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Голубь полетел к " + from + " от " + "с письмом "+ text);
    }

    @Override
    public void recieve() {
        System.out.println("Голубь вернулся с ответным письмом");
    }
}

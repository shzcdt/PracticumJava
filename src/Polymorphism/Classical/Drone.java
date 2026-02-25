package Polymorphism.Classical;

public class Drone implements MailClient{

    @Override
    public void send(String from, String to, String text) {
        System.out.println("Дрон полетел к " + from + " от " + "с письмом "+ text );
    }

    @Override
    public void recieve() {
        System.out.println("Дрон принес вам ответное письмо");
    }
}

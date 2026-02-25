package Polymorphism.Classical.Rodent;

public class Practicum {
    public static void main(String[] args) {
        Rodent rodent = new Capybara();
        rodent.crunch();
        rodent.sleep();

        Capybara capybara = new Capybara();
        capybara.dive();
    }
}

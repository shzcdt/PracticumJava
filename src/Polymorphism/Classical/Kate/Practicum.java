package Polymorphism.Classical.Kate;

public class Practicum{
    public static void main(String[] args) {
        String name = "Катя";
        String lastName = "Бугаева";

        System.out.println("Что" + name + " " + lastName + "делает?");
        Employee employee = new SoftwareDeveloper(name, lastName, 1000);
        employee.work();
        System.out.println("Получает зарплату в час: " + employee.getSalary() + "р.");

        System.out.println("\nЧто " + name + " делает как человек:");
        Person person = new SoftwareDeveloper(name, lastName, 1000);
        person.eat();
        person.sleep();

        System.out.println("\nЧто " + name + " делает как прогер:");
        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(name, lastName, 1000);
        softwareDeveloper.doDebug();
        softwareDeveloper.think();
    }
}

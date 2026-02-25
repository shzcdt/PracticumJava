package Polymorphism.Classical.Kate;

public class Person{
    private String firstName;
    private String lastName;
    private int salary;

    public Person(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void eat(){
        System.out.println("кушаю ам ням");
    }

    public void sleep(){
        System.out.println("Сплю брррррр");
    }
}

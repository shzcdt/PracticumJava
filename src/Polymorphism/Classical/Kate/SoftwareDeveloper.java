package Polymorphism.Classical.Kate;

public class SoftwareDeveloper extends Person implements Employee{
    private int salary;

    public SoftwareDeveloper(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Жестко воркаю");
    }

    public void think(){
        System.out.println("Думаю..");
    }

    public void doDebug(){
        System.out.println("Дебажу код..");
    }
}


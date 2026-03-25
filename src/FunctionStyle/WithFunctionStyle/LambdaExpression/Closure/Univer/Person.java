package FunctionStyle.WithFunctionStyle.LambdaExpression.Closure.Univer;

import java.util.function.Predicate;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Predicate<Person> isOlderPredicate() {
        return person -> person.age > age;
    }
}


package FunctionStyle.WithFunctionStyle.LambdaExpression.Closure.Adder;

import java.util.function.UnaryOperator;

public class Person {
    private String name;
    private int age;
    private String favouriteSpice;

    public Person(String name, int age, String favouriteSpice){
        this.name = name;
        this.age = age;
        this.favouriteSpice = favouriteSpice;
    }

    public String getName() {
        return name;
    }

    public void setFavouriteSpice(String favouriteSpice) {
        this.favouriteSpice = favouriteSpice;
    }

    public String getFavouriteSpice() {
        return favouriteSpice;
    }

    public UnaryOperator<String> addFavouriteSpice() {
        return recipe -> recipe + " " + favouriteSpice;
    }
}
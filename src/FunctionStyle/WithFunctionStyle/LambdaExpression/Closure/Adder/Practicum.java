package FunctionStyle.WithFunctionStyle.LambdaExpression.Closure.Adder;

import java.util.function.UnaryOperator;

public class Practicum {
    public static void main(String[] args) {
        Person person = new Person("Яна", 5, "куркума");
        String oldRecipe = "яйца молоко соль";
        UnaryOperator<String> adder = person.addFavouriteSpice();
        String newRecipe = adder.apply(oldRecipe);
        System.out.println(newRecipe);
        person.setFavouriteSpice("тмин");
        String newRecipe2 = adder.apply(oldRecipe);
        System.out.println(newRecipe2);
    }
}

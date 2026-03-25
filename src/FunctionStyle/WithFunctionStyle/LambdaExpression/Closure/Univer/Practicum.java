package FunctionStyle.WithFunctionStyle.LambdaExpression.Closure.Univer;

public class Practicum {
    public static void main(String[] args) {
        Person kostya = new Person("Костя", 5);

        System.out.println(kostya.isOlderPredicate().test(new Person("Старше", 10)));
        System.out.println(kostya.isOlderPredicate().test(new Person("Младше", 3)));
    }
}

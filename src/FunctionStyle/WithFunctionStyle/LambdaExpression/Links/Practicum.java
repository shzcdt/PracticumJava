package FunctionStyle.WithFunctionStyle.LambdaExpression.Links;

import java.util.ArrayList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(List.of(
                "Мозамбик",
                "Япония",
                "",
                "США",
                ""
        ));

        countries.removeIf(String::isEmpty);
    }
}

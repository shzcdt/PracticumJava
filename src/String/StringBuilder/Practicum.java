package String.StringBuilder;

public class Practicum {
    public static void main(String[] args) {
        StringBuilder example = new StringBuilder("Hello, world!");
        System.out.println(example);

        StringBuilder example2 = new StringBuilder();
        example2.append("Hello, ");
        example2.append("aw World ");
        example2.append(example);
        System.out.println(example2);

        String asString = example2.toString();
        System.out.println(asString);

        System.out.println("\nПрактика метода insert");

        StringBuilder example3 = new StringBuilder("Hello");

        example3.insert(3, "5");
        System.out.println(example3);


        System.out.println("\nПрактика метода replace");

        StringBuilder builder = new StringBuilder("Hello, world!");
        System.out.println(builder);
        builder.replace(7, 13, "java!");

        System.out.println(builder);

        System.out.println("\nПрактика метода delete");
        StringBuilder builder1 = new StringBuilder("Hello, world!");
        System.out.println(builder1);
        builder1.delete(7, 13);
        builder1.deleteCharAt(5);

        System.out.println(builder1);

    }
}

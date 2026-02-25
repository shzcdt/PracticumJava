package Generic.Class;

public class Practicum {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Десять");
        System.out.println("координаты точки с целочисленными координатами");
        pair.print();
        Integer x = pair.getKey();
        String y = pair.getValue();

        System.out.println();

        Pair<String, String> stringPair = new Pair<>("Content-Type", "application/json");
        System.out.println("Заголовок HTTP запросса:");
        stringPair.print();
        String header = stringPair.getKey();
        String headerValue = stringPair.getValue();

//        System.out.println("\nДженерики");
//
//        GeneralClass<String> stringObject = new GeneralClass<String>();
//        stringObject.element = "не привет мир";
//
//        GeneralClass<Double> doubleObj = new GeneralClass<>();
//        doubleObj.element = 100.0;
    }
}


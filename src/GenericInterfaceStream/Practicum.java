package GenericInterfaceStream;

import java.util.List;
import java.util.stream.Stream;

public class Practicum {
    public static void main(String[] args) {
        List<Flat> all = List.of(
                new Flat("Амстердам", 150_000, 50),
                new Flat("Санкт-Петербург", 350_000, 130),
                new Flat("Амстердам", 900_000, 150),
                new Flat("Рим", 60_000, 200),
                new Flat("Лондон", 3000, 30)
        );

        all.stream()
                .filter(flat -> flat.getPrice() < 100_000 && flat.getArea() > 100)
                .map(Flat::getCity)
                .distinct()
                .forEach(System.out::println);
    }
}
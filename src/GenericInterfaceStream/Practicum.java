package GenericInterfaceStream;

import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        List<Flat> all = List.of(
                new Flat("Амстердам", 150_000, 50),
                new Flat("Санкт-Петербург", 350_000, 130),
                new Flat("Амстердам", 900_000, 150),
                new Flat("Рим", 60_000, 200),
                new Flat("Лондон", 3000, 30)
        );

        int price = 100_000;
        int area = 100;

        for (Flat flat : all){
            if (flat.getPrice() <= price & flat.getArea() >= area){
                System.out.println(flat.toString());
            }
        }
    }
}
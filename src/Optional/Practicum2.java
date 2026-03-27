package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Practicum2 {
    public static void main(String[] args) {
        List<String> cosmicTourists = new ArrayList<>();

        findLuckyPerson().ifPresent(cosmicTourists::add);
    }

    public static Optional<String> findLuckyPerson() {
        if (Math.random() <= 0.5){
            return Optional.of("Александр");
        } else {
            return Optional.empty();
        }
    }
}

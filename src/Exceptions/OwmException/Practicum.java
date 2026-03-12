package Exceptions.OwmException;

public class Practicum {
    public static void main(String[] args) {
        PositivePoints positivePoints = new PositivePoints(-5, 2);
        positivePoints.getPositionX();
    }
}

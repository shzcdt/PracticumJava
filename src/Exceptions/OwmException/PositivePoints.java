package Exceptions.OwmException;

public class PositivePoints {
    private int positionX;
    private int positionY;

    public PositivePoints(final int positionX, final int positionY) throws IllegalArgumentException{
        if (positionX < 0 || positionY < 0){
            throw new IllegalArgumentException();
        }
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}

package Abstract;

public class Toad extends Amphibian{

    protected Toad(){
        super("Коричневый");
    }

    @Override
    public void move(){
        System.out.println("Я важно хожу");
    }
}

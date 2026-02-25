package Abstract;

public abstract class Amphibian {
    protected String color;

    protected Amphibian(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    };

    public abstract void move();

    public void eat(){
        System.out.println("Кушаю насекомых");
    }

}

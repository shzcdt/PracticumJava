package GenericAndInheritance;

public class BoundedBox<T extends Number> {
    public T number;

    public BoundedBox(T number){
        this.number = number;
    }
}


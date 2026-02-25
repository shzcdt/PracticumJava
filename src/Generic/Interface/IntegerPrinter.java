package Generic.Interface;

public class IntegerPrinter implements Printer<Integer>{

    @Override
    public void print(Integer value) {
        System.out.printf("%d иммет тип Integer", value);
    }
}


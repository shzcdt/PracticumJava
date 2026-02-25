package Generic.Interface;

public class GeneralPrinter<Type> implements Printer<Type>{

    @Override
    public void print(Type value) {
        System.out.printf("%s имеет тип %s", value, value.getClass());
    }
}



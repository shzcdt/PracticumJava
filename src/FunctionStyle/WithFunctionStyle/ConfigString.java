package FunctionStyle.WithFunctionStyle;

public class ConfigString implements StringsSaverConfig{
    @Override
    public String transform(String line) {
        // жесткая обработка строки
        return "";
    }

    @Override
    public void onSave(String line) {
        // жесткие условие сохранения
    }
}

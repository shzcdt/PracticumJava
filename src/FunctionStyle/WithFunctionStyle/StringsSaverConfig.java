package FunctionStyle.WithFunctionStyle;

public interface StringsSaverConfig {
    // как нужно преобразовать строку
    String transform(String line);

    // дополнительное действие при сохранении
    void onSave(String line);
}

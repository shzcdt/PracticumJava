package FunctionStyle.WithFunctionStyle;

import java.util.LinkedList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        StringsSaverConfig config = new ConfigString();

        StringsSaver saver = new StringsSaver(config);
        saver.save("Пользоватль залогинился");
        saver.save("Пользователь загрузил фото");
        saver.save("Пользователь пополнил счет");
        saver.save("Пользователь снял деньги со счета");

        for (String str : saver.getSaved()) {
            System.out.println(str);
        }
    }
}

class StringsSaver {
    public static final int MAX_SIZE = 3;

    private List<String> saved = new LinkedList<>();
    private StringsSaverConfig config;

    public StringsSaver(StringsSaverConfig config){
        this.config = config;
    }

    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }
        line = config.transform(line);
        saved.add(line);
        config.onSave(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

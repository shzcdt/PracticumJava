package FunctionStyle.WithOutFunctionStyle;

import java.util.LinkedList;
import java.util.List;

public class Practicum {
    public static void main(String[] args) {
        StringSaver saver = new StringSaver();
        saver.save("Пользоватль залогинился");
        saver.save("Пользователь загрузил фото");
        saver.save("Пользователь пополнил счет");
        saver.save("Пользователь снял деньги со счета");

        for (String str : saver.getSaved()){
            System.out.println(str);
        }
    }
}

class StringSaver {
    public static final int  MAX_SIZE = 3;

    private List<String> saved = new LinkedList<>();

    private boolean doAddDate;

    public void setDoAddDate(boolean doAddDate){
        this.doAddDate = doAddDate;
    }

    private boolean doPrintErrors;

    public void setDoPrintErrors(boolean doPrintErrors){
        this.doPrintErrors = doPrintErrors;
    }

    public void save(String line){
        if (saved.size() == MAX_SIZE){
            saved.remove(0);
        }

        if (doAddDate){
            // добавить дату сохранения
        }

        if (doPrintErrors){
            // выводит все ошиби
        }

        saved.add(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}
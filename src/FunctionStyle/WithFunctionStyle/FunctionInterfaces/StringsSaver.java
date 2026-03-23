package FunctionStyle.WithFunctionStyle.FunctionInterfaces;

import java.util.LinkedList;
import java.util.List;

public class StringsSaver {
    public static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private StringsSaverTransformer transformer;
    private StringsConsumer onSaveListener;
    private StringsConsumer onRemoveListener;

    public void setTransformer(StringsSaverTransformer transformer) {
        this.transformer = transformer;
    }

    public void setOnSaveListener(StringsConsumer onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void setOnRemoveListener(StringsConsumer onRemoveListener) {
        this.onRemoveListener = onRemoveListener;
    }
// далее использование этих интерфейсов по отдельности

    public void save(String line){
        if (saved.size() == MAX_SIZE){
            String removedLine = saved.remove(0);
            if (onRemoveListener != null){
                onRemoveListener.accept(removedLine);
            }
        }
        if (transformer != null){
            line = transformer.transform(line);
        }
        saved.add(line);
        if (onSaveListener != null){
            onSaveListener.accept(line);
        }
    }

    public List<String> getSaved() {
        return saved;
    }
}


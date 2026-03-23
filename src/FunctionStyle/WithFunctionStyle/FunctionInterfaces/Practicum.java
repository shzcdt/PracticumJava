package FunctionStyle.WithFunctionStyle.FunctionInterfaces;

public class Practicum {
    public static void main(String[] args){
        StringsSaver saver = new StringsSaver();
        
        saver.setTransformer(new StringsSaverTransformer() {
            @Override
            public String transform(String line) {
                return line.trim();
            }
        });

        saver.setOnRemoveListener(new StringsConsumer() {
            @Override
            public void accept(String value) {
                // метод удаления, либо вывода о том, что строку удалили
            }
        });

        saver.setOnSaveListener(new StringsConsumer() {
            @Override
            public void accept(String value) {
                // метод сохранения, либо вывод о том, что строку созранили
            }
        });
    }
}

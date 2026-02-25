package Interface;

import java.util.ArrayList;
import java.util.List;

public class CalendarApp implements NoteBook {
    private List<String> notes = new ArrayList<>();

    public List<String> getNotes() {
        return notes;
    }

    @Override
    public void addNote(String note) {
        notes.add(note);
        System.out.println("Заметка успешно добавлена");
    }

    @Override
    public void deleteNote(int index){
        notes.remove(index);
        System.out.println("Заметка успешно удалена");
    }
}

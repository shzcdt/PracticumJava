package Interface;

public class main {
    public static void main(String[] args) {
        CalendarApp app = new CalendarApp();
        app.addNote("Жесткая запись");
        app.addNote("Жесткая запись2");
        app.addNote("Жесткая запись3");

        app.deleteNote(2);
        for (String note : app.getNotes()){
            System.out.println(note);
        }


        Pet pet = new Cat();
        pet.eat();
        pet.play();
        pet.makeNoise();

        Mammal mammal = new Cat();
        mammal.giveMilk();
    }
}

public class PersonName {

    private String lastName;
    private String firstName;

    public PersonName(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFullName(){
        return lastName + " " + firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    // возвращает PersonName из заданной строки
    public static PersonName parse(String fullName){
        /* Метод split разделяет строку по символу пробела.
        В результате в переменной parts будет массив из двух элементов: фамилия, имя*/
        String[] parts = fullName.split(" ");
        String lastName = parts[0];
        String firstName = parts[1];

        return new PersonName(lastName, firstName);
    }
}

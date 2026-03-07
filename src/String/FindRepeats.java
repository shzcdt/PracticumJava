package String;

public class FindRepeats {
    int NumberOfRepeats(String text, String substring){
        int count = 0;
        while (text.contains(substring)){
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }

        return count;
    }
}

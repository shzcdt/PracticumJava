package String;

public class OnlySubstring {
    public boolean onlySingleSubstring(String initialString, String substring) {
        return initialString.indexOf(substring) == initialString.lastIndexOf(substring);
    }
}

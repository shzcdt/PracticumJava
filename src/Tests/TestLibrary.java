package Tests;

public class TestLibrary {
    public static <T> void asserEquals(T expected, T actual) {
        if (!expected.equals(actual)){
            throw new RuntimeException(String.format("actual values [%s] not equal to expected [%s]", actual, expected));
        }
    }
}

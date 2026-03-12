package Exceptions.Throw;

import java.net.MalformedURLException;
import java.net.URL;

public class Practicum1 {

    public static void main(String[] args) throws Exception{
        System.out.println(convertStringToUrl("http://ya.ru"));
        System.out.println(convertStringToUrl("11111"));
    }

    public static URL convertStringToUrl(final String input) throws MalformedURLException {
        return new URL(input);
    }
}

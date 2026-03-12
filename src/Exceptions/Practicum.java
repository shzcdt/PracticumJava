package Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Practicum {
    public static void main(String[] args) throws MalformedURLException {
        parseUrl("httppasdas");
    }

    public static java.net.URL parseUrl(final String input) throws MalformedURLException {
        return new java.net.URL(input);
    }
}

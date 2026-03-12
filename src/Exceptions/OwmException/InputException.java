package Exceptions.OwmException;

public class InputException extends Exception{
    public InputException() {

    }

    public InputException(final String message){
        super(message);
    }

    public InputException(final String message, final Throwable cause){
        super(message, cause);
    }

    public InputException(final Throwable cause){
        super(cause);
    }
}


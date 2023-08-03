package exception;

public class StringNotValidException extends Exception {
    public StringNotValidException(){
        super("The string isn't formatted in the right way");
    }
}

public class InvalidAgeException extends Exception{
    private String message;
    public InvalidAgeException(String message) {
        super(message);
    }
}

package application.service.exception;

public class TranslationNotFoundException extends RuntimeException {
    public TranslationNotFoundException(String message) {
        super(message);
    }
}
package application.exception;
public class OrderReviewNotFoundException extends RuntimeException {
    public   OrderReviewNotFoundException(String message) {
        super(message);
    }
}
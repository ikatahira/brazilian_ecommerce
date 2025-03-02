package application.service.exception;

public class OrderReviewNotFoundException extends RuntimeException {
    public OrderReviewNotFoundException(String message) {
        super(message);
    }
}
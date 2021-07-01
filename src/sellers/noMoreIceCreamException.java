package sellers;

//Exception class for empty stock

public class noMoreIceCreamException extends Throwable {
    public noMoreIceCreamException() {
    }
    public noMoreIceCreamException(String message) {
        super(message);
    }
}

package my.task.javacourse.exception;

public class HouseNotFoundException extends RuntimeException{

    public HouseNotFoundException(String message) {
        super(message);
    }
}

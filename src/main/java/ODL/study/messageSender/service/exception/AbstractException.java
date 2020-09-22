package ODL.study.messageSender.service.exception;

public class AbstractException extends RuntimeException {

    private final String name;

    AbstractException(String message, Class<? extends Exception> clazz) {
        super(message);
        this.name = clazz.getSimpleName();
    }

    public String getName() {
        return name;
    }
}

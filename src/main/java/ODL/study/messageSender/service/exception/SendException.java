package ODL.study.messageSender.service.exception;

public class SendException extends AbstractException {

    public SendException(String message) {
        super(message, SendException.class);
    }

}

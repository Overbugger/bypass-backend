package com.api.bypass.exceptions;

public class EventTicketExceptoion extends RuntimeException{

    public EventTicketExceptoion() {
    }

    public EventTicketExceptoion(String message) {
        super(message);
    }

    public EventTicketExceptoion(String message, Throwable cause) {
        super(message, cause);
    }

    public EventTicketExceptoion(Throwable cause) {
        super(cause);
    }

    public EventTicketExceptoion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

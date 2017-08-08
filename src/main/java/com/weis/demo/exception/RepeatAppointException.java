package com.weis.demo.exception;

/**
 * Created by jiangwei on 08/08/2017.
 */
public class RepeatAppointException extends RuntimeException {
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}

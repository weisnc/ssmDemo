package com.weis.demo.exception;

/**
 * Created by jiangwei on 08/08/2017.
 */
public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}

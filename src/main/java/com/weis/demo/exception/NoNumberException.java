package com.weis.demo.exception;

/**
 * Created by jiangwei on 08/08/2017.
 */
public class NoNumberException extends RuntimeException{
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}

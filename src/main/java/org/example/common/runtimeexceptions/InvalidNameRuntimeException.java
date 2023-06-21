package org.example.common.runtimeexceptions;

public class InvalidNameRuntimeException extends RuntimeException {
    public InvalidNameRuntimeException(String message) {
        super(message);
    }
}

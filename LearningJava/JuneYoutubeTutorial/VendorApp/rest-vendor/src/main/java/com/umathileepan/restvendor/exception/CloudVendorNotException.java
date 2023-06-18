package com.umathileepan.restvendor.exception;

public class CloudVendorNotException extends RuntimeException{
    public CloudVendorNotException(String message) {
        super(message);
    }

    public CloudVendorNotException(String message, Throwable cause) {
        super(message, cause);
    }
}

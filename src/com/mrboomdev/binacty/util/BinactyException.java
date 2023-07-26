package com.mrboomdev.binacty.util;

public class BinactyException extends RuntimeException {

    public BinactyException(Object object, Throwable e) {
        super(stringifyObject(object), e);
    }

    public BinactyException(Object object) {
        super(stringifyObject(object));
    }

    public BinactyException(Throwable e) {
        super(e);
    }

    private static String stringifyObject(Object object) {
        if(object == null) return "null";
        return object.toString();
    }
}
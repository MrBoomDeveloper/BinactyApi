package com.mrboomdev.binacty.pack;

public class PackContext {
    private final String id;
    private boolean isReady;

    public PackContext() {
        this.id = String.valueOf(this.toString());
    }

    public PackContext(Object id) {
        this.id = String.valueOf(id);
    }

    public String getId() {
        return this.id;
    }

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }

    public boolean isReady() {
        return this.isReady;
    }
}
package com.mrboomdev.binacty.api.resources;

public abstract class BinactyFile {
    private final String path;

    public BinactyFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }

    public abstract String readString();

    public abstract BinactyFile goTo(String path);
}
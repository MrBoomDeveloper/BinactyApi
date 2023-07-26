package com.mrboomdev.binacty.util;

import com.mrboomdev.binacty.client.backend.Backends;

import java.io.File;

public class BinactyFile {
    private final String path;
    private final Source source;

    public BinactyFile(String path, Source source) {
        this.path = path;
        this.source = source;
    }

    public String getPath() {
        return this.path;
    }

    public String readString() {
        return Backends.files.readString(this);
    }

    public void remove() {
        Backends.files.remove(this);
    }

    public Source getSource() {
        return this.source;
    }

    public BinactyFile goTo(String path) {
        return new BinactyFile(new File(this.path, path).getPath(), source);
    }

    @Override
    public String toString() {
        return "{\"path\":\"" + getPath() + "\",\"source\":\"" + source.name() + "\"}";
    }

    public enum Source {
        INTERNAL,
        EXTERNAL,
        ABSOLUTE
    }
}
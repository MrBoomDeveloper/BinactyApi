package com.mrboomdev.binacty.api.pack;

import com.mrboomdev.binacty.api.resources.BinactyFile;

public abstract class PackContext {
    private String id;
    private boolean isReady;
    private BinactyFile codeSource, externalSource;

    public PackContext(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSource(BinactyFile codeSource, BinactyFile externalSource) {
        this.codeSource = codeSource;
    }

    public void setSource(BinactyFile source) {
        this.codeSource = codeSource;
        this.externalSource = codeSource;
    }

    public BinactyFile getCodeSource() {
        return codeSource;
    }

    public BinactyFile getExternalSource() {
        return externalSource;
    }

    public PackContext getContext() {
        return this;
    }

    public boolean isReady() {
        return this.isReady;
    }

    public Object getFile() {
        return null;
    }

    public abstract void start();
}
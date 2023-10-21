package com.mrboomdev.binacty.api.pack;

import com.mrboomdev.binacty.api.resources.BinactyResources;

public abstract class PackContext {
    private final PackContext parentContext;

    public PackContext(PackContext parentContext) {
        this.parentContext = parentContext;
    }

    public String getId() {
        return parentContext.getId();
    }

    public PackSaves getSaves() {
        return parentContext.getSaves();
    }

    public BinactyResources getResources() {
        return parentContext.getResources();
    }

    public PackContext getContext() {
        return parentContext;
    }

    public boolean isReady() {
        return parentContext.isReady();
    }

    public void start() {
        parentContext.start();
    }

    public void update() {
        parentContext.update();
    }
}
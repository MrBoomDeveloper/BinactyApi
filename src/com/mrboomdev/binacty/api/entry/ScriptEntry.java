package com.mrboomdev.binacty.api.entry;

import com.mrboomdev.binacty.api.client.ClientHolder;

public abstract class ScriptEntry {
    private final ClientHolder client;

    public ScriptEntry(ClientHolder client) {
        this.client = client;
    }

    public void init() {}

    public void start() {}

    public void finish() {}

    public void ready() {
        client.setReady();
    }

    public void setStatus(String status) {
        client.setStatus(status);
    }
}
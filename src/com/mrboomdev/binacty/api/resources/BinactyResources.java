package com.mrboomdev.binacty.api.resources;

import com.mrboomdev.binacty.api.resources.audio.Music;
import com.mrboomdev.binacty.api.resources.audio.Sound;

public class BinactyResources {
    private BinactyResources backend;

    public Music getMusic(String path) {
        return backend.getMusic(path);
    }

    public Sound getSound(String path) {
        return backend.getSound(path);
    }

    public BinactyFile getFile(String path) {
        return backend.getFile(path);
    }

    public boolean isLoaded(String path) {
        return backend.isLoaded(path);
    }

    public void loadMusic(String path) {
        backend.loadMusic(path);
    }

    public void loadSound(String path) {
        backend.loadSound(path);
    }

    public void loadTexture(String path) {
        backend.loadTexture(path);
    }

    public void setBackend(BinactyResources newBackend) {
        this.backend = newBackend;
    }

    public void unload(String path) {
        backend.unload(path);
    }

    public boolean isLoaded() {
        return backend.isLoaded();
    }
}

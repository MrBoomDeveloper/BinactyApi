package com.mrboomdev.binacty.api.resources;

import com.mrboomdev.binacty.api.resources.audio.Music;
import com.mrboomdev.binacty.api.resources.audio.Sound;

public abstract class BinactyResources {

    public abstract BinactyTexture getTexture(String path);

    public abstract Music getMusic(String path);

    public abstract Sound getSound(String path);

    public abstract BinactyFile getFile(String path);

    public abstract boolean isLoaded(String path);

    public abstract void loadMusic(String path);

    public abstract void loadSound(String path);

    public abstract void loadTexture(String path);

    public abstract void unload(String path);

    public abstract boolean isLoaded();
}

package com.mrboomdev.binacty.api.resources.audio;

public abstract class Music {

    public DynamicMusic toDynamic() {
        return new DynamicMusic(this);
    }

    public abstract void play();

    public abstract void stop();

    public abstract void seekTo(float time);

    public abstract float getCurrentTime();
}
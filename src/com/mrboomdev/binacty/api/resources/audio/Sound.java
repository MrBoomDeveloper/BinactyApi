package com.mrboomdev.binacty.api.resources.audio;

public abstract class Sound {

    public long play() {
        return play(1);
    }

    public DynamicSound toDynamic() {
        return new DynamicSound(this);
    }

    public long play(float volume) {
        return play(volume, false);
    }

    public abstract long play(float volume, boolean looping);

    public abstract void setLooping(long id, boolean isLooping);

    public abstract void setVolume(long id, float volume);

    public abstract void stop(long id);

    public abstract void pause(long id);

    public abstract void resume(long id);
}
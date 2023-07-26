package com.mrboomdev.binacty.frontend.audio;

import com.mrboomdev.binacty.client.backend.Backends;
import com.mrboomdev.binacty.util.BinactyFile;

public class Sound {
    private final BinactyFile file;

    public Sound(BinactyFile file) {
        this.file = file;
    }

    public BinactyFile getFile() {
        return this.file;
    }

    public long play() {
        return Backends.audio.play(this, 1);
    }

    public long play(float volume) {
        return Backends.audio.play(this, volume);
    }

    public void setLooping(long id, boolean isLooping) {
        Backends.audio.setLooping(this, id, isLooping);
    }

    public void setVolume(long id, float volume) {
        Backends.audio.setVolume(this, id, volume);
    }

    public void stop(long id) {
        Backends.audio.stop(this, id);
    }

    public void pause(long id) {
        Backends.audio.pause(this, id);
    }

    public void resume(long id) {
        Backends.audio.resume(this, id);
    }
}
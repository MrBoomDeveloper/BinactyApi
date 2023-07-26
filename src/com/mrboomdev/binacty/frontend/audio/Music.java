package com.mrboomdev.binacty.frontend.audio;

import com.mrboomdev.binacty.client.backend.Backends;
import com.mrboomdev.binacty.util.BinactyFile;

public class Music {
    private final BinactyFile file;

    public Music(BinactyFile file) {
        this.file = file;
    }

    public BinactyFile getFile() {
        return this.file;
    }

    public void play() {
        Backends.audio.play(this);
    }

    public void stop() {
        Backends.audio.stop(this);
    }

    public void seekTo(float time) {
        Backends.audio.seekTo(this, time);
    }

    public float getCurrentTime() {
        return Backends.audio.getCurrentTime(this);
    }
}
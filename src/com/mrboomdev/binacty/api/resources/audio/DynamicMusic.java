package com.mrboomdev.binacty.api.resources.audio;

import com.mrboomdev.binacty.api.util.Position2D;

public class DynamicMusic extends Music implements DynamicAudio {
    private Position2D position;
    private final Music music;

    public DynamicMusic(Music music) {
        this.music = music;
    }

    @Override
    public Position2D getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position2D position) {
        this.position = position;
    }

    @Override
    public void play() {
        music.play();
    }

    @Override
    public void stop() {
        music.stop();
    }

    @Override
    public void seekTo(float time) {
        music.seekTo(time);
    }

    @Override
    public float getCurrentTime() {
        return music.getCurrentTime();
    }
}
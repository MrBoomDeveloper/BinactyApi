package com.mrboomdev.binacty.api.resources.audio;

import com.mrboomdev.binacty.api.util.Position2D;

public class DynamicSound extends Sound implements DynamicAudio {
    private Sound sound;
    private Position2D position;

    public DynamicSound(Sound sound) {
        this.sound = sound;
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
    public long play(float volume, boolean looping) {
        return sound.play(volume, looping);
    }

    @Override
    public void setLooping(long id, boolean isLooping) {
        sound.setLooping(id, isLooping);
    }

    @Override
    public void setVolume(long id, float volume) {
        sound.setVolume(id, volume);
    }

    @Override
    public void stop(long id) {
        sound.stop(id);
    }

    @Override
    public void pause(long id) {
        sound.pause(id);
    }

    @Override
    public void resume(long id) {
        sound.resume(id);
    }
}
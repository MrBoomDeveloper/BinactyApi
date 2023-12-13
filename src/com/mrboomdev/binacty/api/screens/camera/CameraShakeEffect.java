package com.mrboomdev.binacty.api.screens.camera;

import com.mrboomdev.binacty.api.util.Position2D;

public class CameraShakeEffect implements CameraEffect {
    private final Position2D position;
    private boolean isFinished;
    private float duration, progress;
    private float movePower, moveLimit, zoomPower, zoomLimit;

    public CameraShakeEffect() {
        position = new Position2D();
    }

    public CameraShakeEffect setDuration(float duration) {
        this.duration = duration;
        return this;
    }

    public CameraShakeEffect setMovePower(float power) {
        this.movePower = power;
        return this;
    }

    public CameraShakeEffect setMoveLimit(float limit) {
        this.moveLimit = limit;
        return this;
    }

    @Override
    public Position2D getPosition() {
        return position;
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public void update(float delta) {
        progress += delta;


    }
}

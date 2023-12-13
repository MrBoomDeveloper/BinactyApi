package com.mrboomdev.binacty.api.screens.camera;

import com.mrboomdev.binacty.api.util.Position2D;

public class CameraFollowEffect implements CameraEffect {

    @Override
    public Position2D getPosition() {
        return null;
    }

    @Override
    public boolean useAsMainPosition() {
        return true;
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void update(float delta) {

    }
}

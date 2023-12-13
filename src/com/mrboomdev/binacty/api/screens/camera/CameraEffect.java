package com.mrboomdev.binacty.api.screens.camera;

import com.mrboomdev.binacty.api.util.Position2D;

public interface CameraEffect {

    Position2D getPosition();

    default float getZoom() {
        return 1;
    }

    default boolean useAsMainPosition() {
        return false;
    }

    boolean isFinished();

    void update(float delta);
}
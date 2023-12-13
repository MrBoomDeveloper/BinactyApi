package com.mrboomdev.binacty.api.util;

import org.jetbrains.annotations.NotNull;

public interface Positionable2D {
    Position2D getPosition();

    void setPosition(float x, float y);

    default void setPosition(@NotNull Positionable2D position) {
        var pos = getPosition();
        var newPos = position.getPosition();

        pos.x = newPos.x;
        pos.y = newPos.y;
    }
}

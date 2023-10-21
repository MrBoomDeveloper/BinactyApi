package com.mrboomdev.binacty.api.util;

import org.jetbrains.annotations.NotNull;

public interface Positionable {
    Position getPosition();

    default void setPosition(@NotNull Positionable position) {
        var pos = getPosition();
        var newPos = position.getPosition();

        pos.x = newPos.x;
        pos.y = newPos.y;
    }

    default void setPosition(float x, float y) {
        var pos = getPosition();

        pos.x = x;
        pos.y = y;
    }
}

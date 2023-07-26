package com.mrboomdev.binacty.util;

import org.jetbrains.annotations.NotNull;

public class Position {
    public float x, y;

    public Position() {}

    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Position(@NotNull Position position) {
        this.x = position.x;
        this.y = position.y;
    }
}
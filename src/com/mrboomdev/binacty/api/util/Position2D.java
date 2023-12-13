package com.mrboomdev.binacty.api.util;

import org.jetbrains.annotations.NotNull;

public class Position2D implements Positionable2D {
    public float x, y;

    public Position2D() {}

    public Position2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void reset() {
        setPosition(0, 0);
    }

    public Position2D add(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Position2D add(@NotNull Position2D position) {
        return add(position.x, position.y);
    }

    public Position2D copy() {
        return new Position2D(x, y);
    }

    public Position2D(@NotNull Position2D position) {
        this.x = position.x;
        this.y = position.y;
    }

    @Override
    public Position2D getPosition() {
        return this;
    }

    @Override
    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
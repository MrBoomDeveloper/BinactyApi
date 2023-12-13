package com.mrboomdev.binacty.api.frontend.physics;

import com.mrboomdev.binacty.api.util.Position2D;
import com.mrboomdev.binacty.api.util.Positionable2D;
import org.jetbrains.annotations.NotNull;

public class PhysicsObject implements Positionable2D {
    private final Position2D position;

    public PhysicsObject(@NotNull Positionable2D position) {
        this(position.getPosition().x, position.getPosition().y);
    }

    public PhysicsObject(float x, float y) {
        this.position = new Position2D(x, y);
    }

    public void setPosition(float x, float y) {
        position.x = x;
        position.y = y;
    }

    @Override
    public Position2D getPosition() {
        return position;
    }
}
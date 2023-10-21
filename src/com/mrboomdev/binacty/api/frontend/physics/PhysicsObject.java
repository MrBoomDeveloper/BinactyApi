package com.mrboomdev.binacty.api.frontend.physics;

import com.mrboomdev.binacty.api.util.Position;
import com.mrboomdev.binacty.api.util.Positionable;
import org.jetbrains.annotations.NotNull;

public class PhysicsObject implements Positionable {
    private final Position position;

    public PhysicsObject(@NotNull Positionable position) {
        this(position.getPosition().x, position.getPosition().y);
    }

    public PhysicsObject(float x, float y) {
        this.position = new Position(x, y);
    }

    public void setPosition(float x, float y) {
        position.x = x;
        position.y = y;
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
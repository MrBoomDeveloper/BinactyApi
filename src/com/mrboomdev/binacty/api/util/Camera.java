package com.mrboomdev.binacty.api.util;

public class Camera implements Positionable {
    private final Position position = new Position();
    private float width, height;

    public Camera(float width, float height) {
        setSize(width, height);
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setSize(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Position getPosition() {
        return position;
    }
}

package com.mrboomdev.binacty.api.screens.camera;

import com.mrboomdev.binacty.api.util.Position2D;
import com.mrboomdev.binacty.api.util.Positionable2D;

import java.util.ArrayList;
import java.util.List;

public class Camera2D implements Positionable2D {
    private static Camera2D currentCamera;
    private final List<CameraEffect> effects = new ArrayList<>();
    private final Position2D position, tempMainAbsolutePosition, effectPosition, absolutePosition;
    private float zoom = 1, effectZoom;
    private Position2D tempMainPosition;
    private CameraEffect tempMainEffect;

    public Camera2D(float width, float height) {
        this.position = new Position2D(width, height);
        this.effectPosition = new Position2D();

        this.absolutePosition = position.copy();
        this.tempMainAbsolutePosition = new Position2D();
    }

    public void addEffect(CameraEffect effect) {
        effects.add(effect);
    }

    public void removeEffect(CameraEffect effect) {
        effects.remove(effect);
    }

    public void clearEffects() {
        effects.clear();
    }

    /**
     * @return A camera zoom without any effects.
     */
    public float getZoom() {
        return zoom;
    }

    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    public static Camera2D getCurrentCamera() {
        return currentCamera;
    }

    /**
     * @return A camera position with all applied effects.
     * (Every time it returns the same object)
     */
    public Position2D getAbsolutePosition() {
        if(tempMainPosition != null) {
            tempMainAbsolutePosition.setPosition(
                    tempMainPosition.x + effectPosition.x,
                    tempMainPosition.y + effectPosition.y);

            return tempMainAbsolutePosition;
        }

        absolutePosition.setPosition(
                position.x + effectPosition.x,
                position.y + effectPosition.y);

        return absolutePosition;
    }

    /**
     * @return A camera zoom with all applied effects.
     */
    public float getAbsoluteZoom() {
        return zoom + effectZoom;
    }

    public static void setCurrentCamera(Camera2D camera) {
        Camera2D.currentCamera = camera;
    }

    /**
     * @return A camera position without any effects.
     * (Every time it returns the same object)
     */
    @Override
    public Position2D getPosition() {
        return position;
    }

    @Override
    public void setPosition(float x, float y) {
        position.setPosition(x, y);
    }

    public void update(float delta) {
        effectPosition.reset();
        effectZoom = 1;

        if(!effects.isEmpty()) {
            var iterator = effects.iterator();

            while(iterator.hasNext()) {
                var effect = iterator.next();
                effect.update(delta);

                if(effect.isFinished()) {
                    if(effect == tempMainEffect) {
                        tempMainEffect = null;
                    }

                    iterator.remove();
                    continue;
                }

                if(effect.useAsMainPosition()) {
                    tempMainEffect = effect;
                }

                var position = effect.getPosition();
                if(position != null) {
                    effectPosition.add(position);
                }

                effectZoom *= effect.getZoom();
            }
        }
    }
}

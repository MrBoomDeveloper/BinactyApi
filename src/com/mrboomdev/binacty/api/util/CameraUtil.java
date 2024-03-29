/*
package com.mrboomdev.binacty.api.util;

public class CameraUtil {
    public static boolean isZoomedForce, isOffsetForce;
    private static BotTarget target;
    private static final float DEFAULT_CAMERA_SPEED = .05f;
    private static float shakePower, shakeDuration, shakeProgress;
    private static float cameraZoomSize, cameraZoomSpeed, cameraSpeed;
    private static final Vector2 shakeCurrent = new Vector2();
    private static final Vector2 offset = new Vector2();
    private static final Vector2 cameraPosition = new Vector2();
    public static OrthographicCamera camera;

    public static void setCameraOffset(float x, float y) {
        if(isOffsetForce) return;

        offset.set(x, y);
    }

    public static void setCameraOffsetForce(float x, float y) {
        isOffsetForce = !(x == 0 && y == 0);
        offset.set(x, y);
    }

    public static void setCameraMoveSpeed(float speed) {
        cameraSpeed = speed;
    }

    public static void setCameraZoom(float size, float speed) {
        if(GameHolder.getInstance().settings.debugCamera) return;

        cameraZoomSize = size;
        cameraZoomSpeed = speed;
        isZoomedForce = false;
    }

    public static void setCameraPosition(float x, float y) {
        var game = GameHolder.getInstance();
        if(game.settings.debugCamera) return;

        camera.position.set(x, y, 0);
        cameraPosition.set(x, y);
    }

    public static void reset() {
        isZoomedForce = false;
        shakePower = 0;
        shakeDuration = 0;
        shakeProgress = 0;
        cameraSpeed = DEFAULT_CAMERA_SPEED;

        setCameraZoom(.5f, .1f);
        offset.setZero();
        shakeCurrent.setZero();
    }

    public static void setTarget(BotTarget target) {
        var game = GameHolder.getInstance();

        if(game.settings.debugCamera) return;

        if(target == null) {
            if(CameraUtil.target == null) {
                cameraPosition.set(camera.position.x, camera.position.y);
            } else {
                var position = CameraUtil.target.getPosition();
                cameraPosition.set(position);
            }
        }

        CameraUtil.target = target;
    }

    public static void update(float delta) {
        var game = GameHolder.getInstance();
        camera.update();

        if(game.settings.debugCamera) {
            cameraSpeed = DEFAULT_CAMERA_SPEED;
        }

        updateEffects(delta);
        updateZoom();
        updatePosition();
    }

    private static void updateEffects(float delta) {
        var game = GameHolder.getInstance();
        shakeProgress += delta;

        if(shakeProgress < shakeDuration && !game.settings.debugCamera) {
            shakeCurrent.set(
                    (float)(Math.random() * shakePower - (shakePower / 2)),
                    (float)Math.random() * shakePower - (shakePower / 2));
        } else {
            shakeCurrent.setZero();
        }
    }

    private static void updatePosition() {
        var newPosition = (target != null ? target.getPosition() : cameraPosition).cpy().add(offset);
        float speed = cameraSpeed / camera.zoom;

        camera.position.set(shakeCurrent.cpy().add(
                camera.position.x + ((newPosition.x - camera.position.x) * speed),
                camera.position.y + ((newPosition.y - camera.position.y) * speed)
        ), 0);
    }

    private static void updateZoom() {
        var game = GameHolder.getInstance();
        if(game.settings.enableEditor || isZoomedForce || game.settings.debugCamera) return;

        float diff = cameraZoomSize - camera.zoom;
        camera.zoom = camera.zoom + (diff * cameraZoomSpeed);
    }
}*/

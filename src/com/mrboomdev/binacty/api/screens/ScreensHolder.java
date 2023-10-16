package com.mrboomdev.binacty.api.screens;

import com.mrboomdev.binacty.api.frontend.graphics.DrawableGraphic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreensHolder implements DrawableGraphic {
    public static final int AUTO_INDEX = -999;
    private final List<DrawableGraphic> screens = new ArrayList<>();
    private final Map<DrawableGraphic, Integer> indexes = new HashMap<>();

    public void addScreen(DrawableGraphic screen, int index) {
        screens.add(screen);
        indexes.put(screen, index);
        updateOrder();
    }

    public void addScreen(DrawableGraphic screen) {
        addScreen(screen, AUTO_INDEX);
    }

    public void removeScreen(DrawableGraphic screen) {
        screens.remove(screen);
        indexes.remove(screen);
        updateOrder();
    }

    public void setIndex(DrawableGraphic screen, int index) {
        indexes.put(screen, index);
        updateOrder();
    }

    private void updateOrder() {
        screens.sort((was, next) -> indexes.get(next) - indexes.get(was));
    }

    @Override
    public void create() {}

    @Override
    public void destroy() {
        for(var screen : screens) {
            screen.destroy();
        }
    }

    @Override
    public void render() {
        if(screens.isEmpty()) return;

        for(var screen : screens) {
            screen.render();
        }
    }
}

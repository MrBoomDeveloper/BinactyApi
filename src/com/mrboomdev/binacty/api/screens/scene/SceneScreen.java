package com.mrboomdev.binacty.api.screens.scene;

import com.mrboomdev.binacty.api.frontend.graphics.DrawableGraphic;

import java.util.ArrayList;
import java.util.List;

public class SceneScreen implements DrawableGraphic {
    private final List<SceneElement> elements = new ArrayList<>();

    @Override
    public void create() {

    }

    @Override
    public void destroy() {

    }

    public void updateOrder() {

    }

    @Override
    public void render() {
        for(var element : elements) {
            element.render();
        }
    }
}

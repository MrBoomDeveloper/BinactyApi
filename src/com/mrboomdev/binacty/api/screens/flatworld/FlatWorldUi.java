package com.mrboomdev.binacty.api.screens.flatworld;

import com.mrboomdev.binacty.api.frontend.graphics.DrawableGraphic;
import com.mrboomdev.binacty.api.frontend.graphics.widget.Widget;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlatWorldUi implements DrawableGraphic {
    private final List<Widget> widgets;

    public FlatWorldUi() {
        this.widgets = new ArrayList<>();
    }

    public void addWidget(@NotNull Widget widget) {
        if(!widget.getDidCreated()) {
            widget.create();
        }

        widgets.add(widget);
    }

    public void removeWidget(@NotNull Widget widget) {
        if(!widget.getDidDestroyed()) {
            widget.destroy();
        }

        widgets.remove(widget);
    }

    @Override
    public void create() {

    }

    @Override
    public void destroy() {
        if(widgets.isEmpty()) return;
        for(var widget : widgets) {
            widget.destroy();
        }
    }

    @Override
    public void render() {
        if(widgets.isEmpty()) return;

        widgets.sort(Comparator.comparingInt(Widget::getIndex));

        for(var widget : widgets) {
            widget.render();
        }
    }
}
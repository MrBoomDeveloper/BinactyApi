package com.mrboomdev.binacty.screens.flatworld;

import com.mrboomdev.binacty.frontend.graphics.DrawableGraphic;
import com.mrboomdev.binacty.frontend.graphics.widget.Widget;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FlatWorldUi implements DrawableGraphic {
    private final List<Widget> widgets;

    public FlatWorldUi() {
        this.widgets = new ArrayList<>();
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
        widget.start();
    }

    public void removeWidget(Widget widget) {
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
    public void start() {

    }

    @Override
    public void render() {
        if(widgets.isEmpty()) return;

        widgets.sort(Comparator.comparingInt(previous -> previous.index));

        for(var widget : widgets) {
            widget.render();
        }
    }

    @Override
    public void end() {
        if(widgets.isEmpty()) return;
        for(var widget : widgets) {
            widget.end();
        }
    }
}
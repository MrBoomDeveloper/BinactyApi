package com.mrboomdev.binacty.api.frontend.graphics.widget;

import com.mrboomdev.binacty.api.frontend.graphics.DrawableGraphic;

public abstract class Widget implements DrawableGraphic {
    private int index;
    private final String id;
    private boolean didCreated, didDestroyed;

    public Widget() {
        this.id = String.valueOf(this.toString());
    }

    public Widget(Object id) {
        this.id = String.valueOf(id);
    }

    public String getId() {
        return this.id;
    }

    public boolean getDidCreated() {
        return didCreated;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean getDidDestroyed() {
        return didDestroyed;
    }

    @Override
    public void create() {
        didCreated = true;
    }

    @Override
    public void destroy() {
        didDestroyed = true;
    }
}
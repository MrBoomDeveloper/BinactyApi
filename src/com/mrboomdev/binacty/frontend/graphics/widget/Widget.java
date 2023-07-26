package com.mrboomdev.binacty.frontend.graphics.widget;

import com.mrboomdev.binacty.frontend.graphics.DrawableGraphic;
import com.mrboomdev.binacty.frontend.util.LogUtil;

public abstract class Widget implements DrawableGraphic {
    public int index;
    private final String id;

    public Widget() {
        this.id = String.valueOf(this.toString());
    }

    public Widget(Object id) {
        this.id = String.valueOf(id);
    }

    public String getId() {
        return this.id;
    }

    @Override
    public void create() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Widget \"" + id + "\" created");
    }

    @Override
    public void destroy() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Widget \"" + id + "\" destroyed");
    }

    @Override
    public void start() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Widget \"" + id + "\" started");
    }

    @Override
    public void render() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Widget \"" + id + "\" render");
    }

    @Override
    public void end() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Widget \"" + id + "\" ended");
    }
}
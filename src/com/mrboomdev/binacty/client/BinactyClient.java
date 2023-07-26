package com.mrboomdev.binacty.client;

import com.mrboomdev.binacty.frontend.graphics.DrawableGraphic;
import com.mrboomdev.binacty.frontend.util.LogUtil;
import com.mrboomdev.binacty.pack.PackContext;
import org.jetbrains.annotations.NotNull;

public class BinactyClient extends PackContext implements DrawableGraphic {
    private DrawableGraphic screen;

    @Override
    public void create() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Client created");
    }

    public void setScreen(@NotNull DrawableGraphic screen) {
        this.screen = screen;
    }

    @Override
    public void destroy() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Client destroyed");
    }

    @Override
    public void start() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Client started");
    }

    @Override
    public void render() {
        screen.render();
    }

    @Override
    public void end() {
        LogUtil.log(LogUtil.Type.GRAPHIC_STATE, "Client ended");
    }
}
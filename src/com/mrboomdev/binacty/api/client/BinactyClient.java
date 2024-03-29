package com.mrboomdev.binacty.api.client;

import com.mrboomdev.binacty.api.frontend.graphics.DrawableGraphic;
import com.mrboomdev.binacty.api.pack.PackContext;
import org.jetbrains.annotations.NotNull;

public class BinactyClient extends PackContext implements DrawableGraphic {
    private DrawableGraphic screen;

    @Override
    public void update() {
        super.update();

        var screen = getScreen();
        if(screen != null) screen.update();
    }

    public BinactyClient(PackContext context) {
        super(context);
    }

    @Override
    public void create() {}

    public void setScreen(@NotNull DrawableGraphic screen) {
        this.screen = screen;
    }

    public DrawableGraphic getScreen() {
        return this.screen;
    }

    @Override
    public void destroy() {}

    @Override
    public void start() {}

    @Override
    public void render() {
        if(screen != null) screen.render();
    }
}
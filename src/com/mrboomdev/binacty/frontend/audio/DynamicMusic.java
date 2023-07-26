package com.mrboomdev.binacty.frontend.audio;

import com.mrboomdev.binacty.util.BinactyFile;
import com.mrboomdev.binacty.util.Position;

public class DynamicMusic extends Music implements DynamicAudio {
    private Position position;

    public DynamicMusic(BinactyFile file) {
        super(file);
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
}
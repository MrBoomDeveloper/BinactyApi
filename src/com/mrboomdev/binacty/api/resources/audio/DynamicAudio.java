package com.mrboomdev.binacty.api.resources.audio;

import com.mrboomdev.binacty.api.util.Position2D;

public interface DynamicAudio {
    Position2D getPosition();
    void setPosition(Position2D position);
}
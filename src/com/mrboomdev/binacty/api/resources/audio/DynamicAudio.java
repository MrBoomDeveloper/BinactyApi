package com.mrboomdev.binacty.api.resources.audio;

import com.mrboomdev.binacty.api.util.Position;

public interface DynamicAudio {
    Position getPosition();
    void setPosition(Position position);
}
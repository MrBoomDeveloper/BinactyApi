package com.mrboomdev.binacty.api.frontend.physics;

import java.util.ArrayList;
import java.util.List;

public class PhysicsWorld {
    private List<PhysicsObject> objects = new ArrayList<>();

    public void addObject(PhysicsObject object) {
        objects.add(object);
    }
}

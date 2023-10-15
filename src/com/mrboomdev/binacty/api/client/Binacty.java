package com.mrboomdev.binacty.api.client;

import com.mrboomdev.binacty.api.resources.BinactyResources;

public class Binacty {
    public static BinactyResources resources;

    public static void unload() {
        resources = null;
    }
}

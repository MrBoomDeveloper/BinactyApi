package com.mrboomdev.binacty.api;

import com.mrboomdev.binacty.api.client.BinactyClient;
import com.mrboomdev.binacty.api.screens.flatworld.FlatWorldScreen;

public class TestMain {

    public static void main(String[] args) {
        var client = new TestClient();
        client.create();
    }

    private static class TestClient extends BinactyClient {
        private FlatWorldScreen world;

        public TestClient() {
            super(null);
        }

        @Override
        public void create() {
            super.create();

            this.world = new FlatWorldScreen();
            setScreen(world);
        }
    }
}
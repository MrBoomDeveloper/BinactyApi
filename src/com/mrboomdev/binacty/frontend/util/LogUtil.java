package com.mrboomdev.binacty.frontend.util;

import org.jetbrains.annotations.NotNull;

public class LogUtil {

    public static void log(@NotNull Type type, String message) {
        System.out.println(type.title + " : " + message);
    }

    public static void error(@NotNull Type type, String message) {
        System.err.println(type.title + " : " + message);
    }

    public enum Type {
        GRAPHIC_STATE("GraphicState");

        public final String title;

        Type(String title) {
            this.title = title;
        }
    }
}
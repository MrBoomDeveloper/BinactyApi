package com.mrboomdev.binacty.api.pack;

public abstract class PackSaves {
    public abstract String getString(String name, String defaultValue);
    public abstract int getInt(String name, int defaultValue);
    public abstract boolean getBoolean(String name, boolean defaultValue);
    public abstract float getFloat(String name, float defaultValue);

    public String getString(String name) {
        return getString(name, "");
    }

    public int getInt(String name) {
        return getInt(name, 0);
    }

    public boolean getBoolean(String name) {
        return getBoolean(name, false);
    }

    public float getFloat(String name) {
        return getFloat(name, 0);
    }

    public abstract void setString(String name, String value);
    public abstract void setFloat(String name, float value);
    public abstract void setInt(String name, int value);
    public abstract void setBoolean(String name, boolean value);

    public abstract void reload();
    public abstract void save();
}
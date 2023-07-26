package com.mrboomdev.binacty.client.backend;

import com.mrboomdev.binacty.util.BinactyFile;

public interface FileBackend {
    String readString(BinactyFile file);
    void remove(BinactyFile file);
}